package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

import java.util.ArrayList;

public class CountingHouseCard extends DomCard {
    public CountingHouseCard() {
        super(DomCardName.CountingHouse);
    }

    public void play() {
        ArrayList<DomCard> theCoppers = owner.removeCardsFromDiscard(DomCardName.Copper);
        for (DomCard theCard : theCoppers) {
            owner.putInHand(theCard);
        }
    }
}
