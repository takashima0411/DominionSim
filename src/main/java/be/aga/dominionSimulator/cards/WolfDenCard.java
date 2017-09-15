package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomPlayer;
import be.aga.dominionSimulator.enums.DomCardName;

public class WolfDenCard extends DomCard {
    public WolfDenCard() {
        super(DomCardName.WolfDen);
    }

    public static int countVP(DomPlayer aPlayer) {
        return -aPlayer.getDeck().countSingletonCards() * 3;
    }
}
