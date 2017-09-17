package be.aga.dominionSimulator;

import be.aga.dominionSimulator.enums.DomBotType;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.Stack;

/**
 * This class will load the Dominion bot players into memory
 */

public final class XMLHandler extends DefaultHandler {
    private Stack stack;
    private boolean isStackReadyForText;
    private ArrayList<DomPlayer> bots = new ArrayList<>();

    public XMLHandler() {
        stack = new Stack();
        isStackReadyForText = false;
    }

    public void startElement(String uri, String localName, String qName, Attributes attribs) {
        isStackReadyForText = false;
        if (localName.equals("playerCollection")) {
            stack.push(new ArrayList<>());
        } else if (localName.equals("player")) {
            stack.push(new DomPlayer(resolveAttrib(uri, "name", attribs, null),
                    resolveAttrib(uri, "author", attribs, null),
                    resolveAttrib(uri, "description", attribs, null)));
        } else if (localName.equals("type")) {
            String attribValue = resolveAttrib(uri, "name", attribs, null);
            try {
                ((DomPlayer) stack.peek()).addType(DomBotType.valueOf(attribValue));
            } catch (IllegalArgumentException e) {
                // Ignore unknown types.
            }
        } else if (localName.equals("board")) {
            ((DomPlayer) stack.peek())
                    .addBoard(
                            resolveAttrib(uri, "contents", attribs, null),
                            resolveAttrib(uri, "bane", attribs, null),
                            Integer.valueOf(resolveAttrib(uri, "MountainPassBid", attribs, null)),
                            resolveAttrib(uri, "ObeliskChoice", attribs, null));
        } else if (localName.equals("startState")) {
            stack.push(new StartState());
        } else if (localName.equals("hand")) {
            ((StartState) stack.peek()).addHand(resolveAttrib(uri, "contents", attribs, null));
        } else if (localName.equals("drawdeck")) {
            ((StartState) stack.peek()).addDrawDeck(resolveAttrib(uri, "contents", attribs, null), resolveAttrib(uri, "shuffle", attribs, null));
        } else if (localName.equals("discard")) {
            ((StartState) stack.peek()).addDiscard(resolveAttrib(uri, "contents", attribs, null));
        } else if (localName.equals("hand")) {
            ((StartState) stack.peek()).addHand(resolveAttrib(uri, "contents", attribs, null));
        } else if (localName.equals("buy")) {
            ((DomPlayer) stack.peek()).addPlayStrategy(resolveAttrib(uri, "name", attribs, null), resolveAttrib(uri, "strategy", attribs, null));
            stack.push(new DomBuyRule(resolveAttrib(uri, "name", attribs, null), resolveAttrib(uri, "strategy", attribs, null), resolveAttrib(uri, "bane", attribs, null)));
        } else if (localName.equals("condition")) {
            stack.push(new DomBuyCondition());
        } else if (localName.equals("left")) {
            ((DomBuyCondition) stack.peek()).addLeftHand(resolveAttrib(uri, "type", attribs, null), resolveAttrib(uri, "attribute", attribs, null));
        } else if (localName.equals("operator")) {
            ((DomBuyCondition) stack.peek()).addComparator(resolveAttrib(uri, "type", attribs, null));
        } else if (localName.equals("right")) {
            ((DomBuyCondition) stack.peek()).addRightHand(resolveAttrib(uri, "type", attribs, null), resolveAttrib(uri, "attribute", attribs, null));
        } else if (localName.equals("extraOperation")) {
            ((DomBuyCondition) stack.peek()).addExtraOperation(resolveAttrib(uri, "type", attribs, null), resolveAttrib(uri, "attribute", attribs, null));
        } else {
            // do nothing
        }
    }

    public void endElement(String uri, String localName, String qName) {
        // recognized text is always content of an element
        // when the element closes, no more text should be expected
        isStackReadyForText = false;
        // pop stack and add to 'parent' element, which is next on the stack
        // important to pop stack first, then peek at top element!
        if (localName.equals("playerCollection")) {
            bots = (ArrayList<DomPlayer>) stack.pop();
        }
        if (localName.equals("player")) {
            DomPlayer tmp = (DomPlayer) stack.pop();
            if (stack.isEmpty()) {
                bots.add(tmp);
            } else {
                ((ArrayList<DomPlayer>) stack.peek()).add(tmp);
            }
        }
        if (localName.equals("buy")) {
            DomBuyRule tmp = (DomBuyRule) stack.pop();
            ((DomPlayer) stack.peek()).addBuyRule(tmp);
        }
        if (localName.equals("condition")) {
            DomBuyCondition tmp = (DomBuyCondition) stack.pop();
            ((DomBuyRule) stack.peek()).addCondition(tmp);
        }
        if (localName.equals("startState")) {
            StartState tmp = (StartState) stack.pop();
            ((DomPlayer) stack.peek()).setStartState(tmp);
        }
    }

    public void characters(char[] data, int start, int length) {
        if (isStackReadyForText) {
            ((StringBuffer) stack.peek()).append(data, start, length);
        } else {
        }
    }

    private String resolveAttrib(String uri, String localName, Attributes attribs, String defaultValue) {
        String tmp = attribs.getValue(uri, localName);
        return (tmp != null) ? (tmp) : (defaultValue);
    }

    public ArrayList<DomPlayer> getBots() {
        return bots;
    }
}
