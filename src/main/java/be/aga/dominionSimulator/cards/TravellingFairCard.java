package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;


public class TravellingFairCard extends DomCard {
    public TravellingFairCard() {
        super(DomCardName.TravellingFair);
    }

    public void play() {
        owner.addAvailableBuys(2);
        owner.activateTravellingFair();
    }
}
