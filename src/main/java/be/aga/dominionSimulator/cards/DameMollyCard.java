package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.enums.DomCardName;


public class DameMollyCard extends KnightCard {

    public DameMollyCard() {
        super(DomCardName.DameMolly);
    }

    public void play() {
        owner.addActions(2);
        super.play();
    }
}
