package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class MerchantGuildCard extends DomCard {

    public MerchantGuildCard() {
        super(DomCardName.MerchantGuild);
    }

    public void play() {
        owner.addAvailableBuys(1);
        owner.addAvailableCoins(1);
    }
}
