package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.enums.DomCardName;

public class SirMartinCard extends KnightCard {

    public SirMartinCard() {
        super(DomCardName.SirMartin);
    }

    public void play() {
        owner.addAvailableBuys(2);
        super.play();
    }
}
