package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomEngine;
import be.aga.dominionSimulator.DomPlayer;
import be.aga.dominionSimulator.enums.DomCardName;

public class YoungWitchCard extends DomCard {
    public YoungWitchCard() {
        super(DomCardName.YoungWitch);
    }

    public void play() {
        owner.drawCards(2);
        owner.doForcedDiscard(2, false);
        for (DomPlayer thePlayer : owner.getOpponents()) {
            if (thePlayer.checkDefense())
                return;
            for (DomCard card : thePlayer.getCardsInHand()) {
                if (card.isBane()) {
                    if (DomEngine.haveToLog) DomEngine.addToLog(thePlayer + " reveals the Bane card " + card);
                    return;
                }
            }
            thePlayer.gain(DomCardName.Curse);
        }
    }
}
