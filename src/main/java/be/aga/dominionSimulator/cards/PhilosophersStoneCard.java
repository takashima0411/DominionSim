package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class PhilosophersStoneCard extends DomCard {
    public PhilosophersStoneCard() {
        super(DomCardName.PhilosophersStone);
    }

    @Override
    public int getCoinValue() {
        return owner.getDeckSize() / 5;
    }
}
