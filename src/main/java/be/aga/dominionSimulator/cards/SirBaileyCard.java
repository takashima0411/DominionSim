package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.enums.DomCardName;

public class SirBaileyCard extends KnightCard {

    public SirBaileyCard() {
        super(DomCardName.SirBailey);
    }

    public void play() {
        owner.addActions(1);
        owner.drawCards(1);
        super.play();
    }
}
