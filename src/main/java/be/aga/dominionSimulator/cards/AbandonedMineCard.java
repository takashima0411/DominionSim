package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class AbandonedMineCard extends DomCard {

    public AbandonedMineCard() {
        super(DomCardName.AbandonedMine);
    }

    @Override
    public void play() {
        owner.addAvailableCoins(1);
    }
}
