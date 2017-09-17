package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomPlayer;
import be.aga.dominionSimulator.enums.DomCardName;


public class ObeliskCard extends DomCard {

    public ObeliskCard() {
        super(DomCardName.Obelisk);
    }

    public static int countVP(DomPlayer aPlayer) {
        DomCardName cardForObelisk = null;
        for (DomPlayer thePlayer : aPlayer.getCurrentGame().getPlayers()) {
            if (thePlayer.getObeliskChoice() != null) {
                cardForObelisk = thePlayer.getCardForObelisk();
                break;
            }
        }
        if (cardForObelisk == null)
            return 0;
        return aPlayer.countInDeck(cardForObelisk) * 2;
    }
}
