package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

import java.util.ArrayList;

public class HuntingPartyCard extends DomCard {
    public HuntingPartyCard() {
        super(DomCardName.HuntingParty);
    }

    public void play() {
        owner.addActions(1);
        owner.drawCards(1);
//      owner.showHand();
        ArrayList<DomCard> theRevealedCards = new ArrayList<>();
        for (; ; ) {
            ArrayList<DomCard> theTopCard = owner.revealTopCards(1);
            if (theTopCard.isEmpty())
                break;
            if (!hasDuplicateInHand(theTopCard.get(0))) {
                owner.putInHand(theTopCard.get(0));
                break;
            } else {
                theRevealedCards.add(theTopCard.get(0));
            }
        }
        owner.discard(theRevealedCards);
    }

    public boolean hasDuplicateInHand(DomCard aCard) {
        for (DomCard theCard : owner.getCardsInHand()) {
            if (theCard.getName() == aCard.getName())
                return true;
        }
        return false;
    }
}
