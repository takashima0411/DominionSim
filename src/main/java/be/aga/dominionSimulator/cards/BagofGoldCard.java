package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class BagofGoldCard extends DomCard {
    public BagofGoldCard() {
        super(DomCardName.BagOfGold);
    }

    public void play() {
        owner.addActions(1);
        DomCard theGold = owner.getCurrentGame().takeFromSupply(DomCardName.Gold);
        if (theGold != null) {
            owner.gainOnTopOfDeck(theGold);
        }
    }
}
