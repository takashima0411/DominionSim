package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class BustlingVillageCard extends DomCard {
    public BustlingVillageCard() {
        super(DomCardName.BustlingVillage);
    }

    public void play() {
        owner.addActions(3);
        owner.drawCards(1);
        DomCard theSettler = owner.removeFromDiscard(DomCardName.Settlers);
        if (theSettler != null)
            owner.putInHand(theSettler);
    }
}
