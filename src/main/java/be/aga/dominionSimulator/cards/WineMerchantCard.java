package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class WineMerchantCard extends DomCard {
    public WineMerchantCard() {
        super(DomCardName.WineMerchant);
    }

    public void play() {
        owner.addAvailableBuys(1);
        owner.addAvailableCoins(4);
        if (!owner.getCardsFromPlay(DomCardName.WineMerchant).isEmpty())
            owner.putOnTavernMat(owner.removeCardFromPlay(this));
    }
}
