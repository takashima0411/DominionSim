package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class CoinOfTheRealmCard extends DomCard {
    public CoinOfTheRealmCard() {
        super(DomCardName.CoinOfTheRealm);
    }

    public void play() {
        owner.addAvailableCoins(1);
        if (owner.getCardsFromPlay(getName()).contains(this))
            owner.putOnTavernMat(owner.removeCardFromPlay(this));
    }

    @Override
    public void doWhenCalled() {
        owner.addActions(2);
    }
}
