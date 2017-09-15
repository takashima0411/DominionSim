package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class HorseTradersCard extends DomCard {
    public HorseTradersCard() {
        super(DomCardName.HorseTraders);
    }

    public void play() {
        owner.addAvailableBuys(1);
        owner.addAvailableCoins(3);
        owner.doForcedDiscard(2, false);
    }
}
