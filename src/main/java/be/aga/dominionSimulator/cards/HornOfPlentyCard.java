package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomCost;
import be.aga.dominionSimulator.DomEngine;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

import java.util.HashSet;

public class HornOfPlentyCard extends DomCard {
    public HornOfPlentyCard() {
        super(DomCardName.HornOfPlenty);
    }

    public void play() {
        HashSet<DomCardName> theSingleCards = new HashSet<>();
        for (DomCard card : owner.getCardsInPlay()) {
            theSingleCards.add(card.getName());
        }
        if (DomEngine.haveToLog)
            DomEngine.addToLog(owner + " has " + theSingleCards.size() + " different cards in play");
        DomCardName theCardToGain = owner.getDesiredCardWithRestriction(null, new DomCost(theSingleCards.size(), 0), false, DomCardName.Stonemason);
        if (theCardToGain == null) {
            //possibly null if played by Venture
            theCardToGain = owner.getCurrentGame().getBestCardInSupplyFor(owner, null, new DomCost(theSingleCards.size(), 0));
        }
        if (owner.stillInEarlyGame() && theCardToGain.hasCardType(DomCardType.Victory) && (theCardToGain.hasCardType(DomCardType.Action) || theCardToGain.hasCardType(DomCardType.Treasure)))
            theCardToGain = owner.getDesiredCard(null, new DomCost(theSingleCards.size(), 0), false, false, DomCardType.Victory);
        if (theCardToGain == null) {
            //possibly null if played by Venture
            theCardToGain = owner.getCurrentGame().getBestCardInSupplyFor(owner, null, new DomCost(theSingleCards.size(), 0));
        }
        if (theCardToGain == null)
            return;
        owner.gain(theCardToGain);
        if (theCardToGain.hasCardType(DomCardType.Victory) && owner.getCardsFromPlay(getName()).contains(this))
            owner.trash(owner.removeCardFromPlay(this));
    }

    @Override
    public boolean wantsToBePlayed() {
        HashSet<DomCardName> theSingleCards = new HashSet<>();
        theSingleCards.add(getName());
        for (DomCard card : owner.getCardsInPlay()) {
            theSingleCards.add(card.getName());
        }
        DomCardName theCardToGain = owner.getDesiredCard(new DomCost(theSingleCards.size(), 0), false);
        return theCardToGain != null;
    }
}
