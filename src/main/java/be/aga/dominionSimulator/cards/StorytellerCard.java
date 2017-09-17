package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomEngine;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

public class StorytellerCard extends DomCard {
    public StorytellerCard() {
        super(DomCardName.Storyteller);
    }

    public void play() {
        owner.addActions(1);
        owner.addAvailableCoins(1);
        DomCard theCardToPlay;

        if (owner.getAvailableCoins() < owner.getDeckSize()) {
            int thePlayCount = 0;
            do {
                theCardToPlay = null;
                for (DomCard theCard : owner.getCardsInHand()) {
                    if (theCard.hasCardType(DomCardType.Treasure)) {
                        if (theCardToPlay == null || theCard.getPlayPriority() < theCardToPlay.getPlayPriority()) {
                            if (theCard.wantsToBePlayed())
                                theCardToPlay = theCard;
                        }
                    }
                }
                if (theCardToPlay != null) {
                    owner.play(owner.removeCardFromHand(theCardToPlay));
                    thePlayCount++;
                }
            } while (theCardToPlay != null && owner.getAvailableCoins() < owner.getDeckSize() && thePlayCount < 3);
        }

        if (DomEngine.haveToLog) {
            if (owner.getPreviousPlayedCardName() != null) {
                DomEngine.addToLog(owner + " plays " + (owner.getSameCardCount() + 1) + " " + owner.getPreviousPlayedCardName().toHTML()
                        + (owner.getSameCardCount() > 0 ? "s" : ""));
                owner.setPreviousPlayedCardName(null);
                owner.setSameCardCount(0);
            }
        }
        owner.drawCards(owner.getAvailableCoinsWithoutTokens());
        owner.setAvailableCoins(0);
    }
}
