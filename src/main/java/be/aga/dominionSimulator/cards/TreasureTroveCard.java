package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class TreasureTroveCard extends DomCard {
    public TreasureTroveCard() {
        super(DomCardName.TreasureTrove);
    }

    public void play() {
        owner.addAvailableCoins(2);
        owner.gain(DomCardName.Gold);
        owner.gain(DomCardName.Copper);
    }
}
