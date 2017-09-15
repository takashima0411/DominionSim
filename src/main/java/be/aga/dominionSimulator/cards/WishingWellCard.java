package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomEngine;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomPlayStrategy;

public class WishingWellCard extends DomCard {
    public WishingWellCard() {
        super(DomCardName.WishingWell);
    }

    public void play() {
        owner.addActions(1);
        owner.drawCards(1);
        if (owner.getDeckSize() == 0)
            return;
        DomCardName theChoice = null;
        if (owner.getPlayStrategyFor(this) == DomPlayStrategy.goodDeckTracker)
            theChoice = owner.getDeck().getMostLikelyCardOnTop();
        else if (owner.getPlayStrategyFor(this) == DomPlayStrategy.greedyDeckTracker)
            theChoice = owner.getDeck().getMostWantedCardOnTop();
        else
            theChoice = DomCardName.WishingWell;
        if (DomEngine.haveToLog) DomEngine.addToLog(owner + " names " + theChoice.toHTML());
        DomCard theRevealedCard = owner.revealTopCards(1).get(0);
        if (theRevealedCard.getName() == theChoice) {
            owner.putInHand(theRevealedCard);
        } else {
            owner.putOnTopOfDeck(theRevealedCard);
        }
    }
}
