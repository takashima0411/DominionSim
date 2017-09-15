package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.enums.DomCardName;

public class DameSylviaCard extends KnightCard {

    public DameSylviaCard() {
        super(DomCardName.DameSylvia);
    }

    public void play() {
        owner.addAvailableCoins(2);
        super.play();
    }
}
