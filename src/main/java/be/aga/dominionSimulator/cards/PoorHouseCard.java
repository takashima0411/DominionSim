package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

public class PoorHouseCard extends DomCard {
    public PoorHouseCard() {
        super(DomCardName.PoorHouse);
    }

    public void play() {
        owner.addAvailableCoins(4);
        owner.removeAvailableCoins(owner.getCardsFromHand(DomCardType.Treasure).size());
    }

    @Override
    public double getPotentialCoinValue() {
        return 4 - owner.getCardsFromHand(DomCardType.Treasure).size();
    }
}
