package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomPlayer;
import be.aga.dominionSimulator.enums.DomCardName;

public class GhostShipCard extends DomCard {
    public GhostShipCard() {
        super(DomCardName.GhostShip);
    }

    public void play() {
        owner.drawCards(2);
        for (DomPlayer thePlayer : owner.getOpponents()) {
            if (thePlayer.checkDefense())
                continue;
            thePlayer.doForcedDiscard(thePlayer.getCardsInHand().size() - 3, true);
        }
    }
}
