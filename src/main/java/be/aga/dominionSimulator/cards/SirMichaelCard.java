package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomPlayer;
import be.aga.dominionSimulator.enums.DomCardName;

public class SirMichaelCard extends KnightCard {
    public SirMichaelCard() {
        super(DomCardName.SirMichael);
    }

    public void play() {
        for (DomPlayer thePlayer : owner.getOpponents()) {
            if (!thePlayer.checkDefense()) {
                thePlayer.doForcedDiscard(thePlayer.getCardsInHand().size() - 3, false);
            }
        }
        super.play();
    }
}
