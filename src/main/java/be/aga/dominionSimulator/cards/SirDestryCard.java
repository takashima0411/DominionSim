package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.enums.DomCardName;

public class SirDestryCard extends KnightCard {

    public SirDestryCard() {
        super(DomCardName.SirDestry);
    }

    public void play() {
        owner.drawCards(2);
        super.play();
    }
}
