package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class MerchantShipCard extends DomCard {
    public MerchantShipCard() {
        super(DomCardName.MerchantShip);
    }

    public void play() {
        owner.addAvailableCoins(2);
    }

    public void resolveDuration() {
        owner.addAvailableCoins(2);
    }
}
