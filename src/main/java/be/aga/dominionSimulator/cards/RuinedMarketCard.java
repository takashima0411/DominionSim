package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class RuinedMarketCard extends DomCard {

    public RuinedMarketCard() {
        super(DomCardName.RuinedMarket);
    }

    @Override
    public void play() {
        owner.addAvailableBuys(1);
    }
}
