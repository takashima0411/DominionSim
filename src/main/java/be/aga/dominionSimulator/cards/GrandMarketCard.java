package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class GrandMarketCard extends DomCard {
    public GrandMarketCard() {
        super(DomCardName.GrandMarket);
    }

    public void play() {
        owner.addActions(1);
        owner.addAvailableCoins(2);
        owner.addAvailableBuys(1);
        owner.drawCards(1);
    }
}
