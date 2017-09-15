package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.enums.DomCardName;

public class SirVanderCard extends KnightCard {

    public SirVanderCard() {
        super(DomCardName.SirVander);
    }

    public void play() {
        super.play();
    }

    @Override
    public void doWhenTrashed() {
        owner.gain(DomCardName.Gold);
    }
}
