package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomPlayer;
import be.aga.dominionSimulator.enums.DomCardName;


public class BanditFortCard extends DomCard {
    public BanditFortCard() {
        super(DomCardName.BanditFort);
    }

    public static int countVP(DomPlayer aPlayer) {
        int theVP = 0;
        theVP -= aPlayer.countInDeck(DomCardName.Silver) * 2;
        theVP -= aPlayer.countInDeck(DomCardName.Gold) * 2;
        return theVP;
    }
}
