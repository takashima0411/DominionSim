package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class WorkersVillageCard extends DomCard {
    public WorkersVillageCard() {
        super(DomCardName.WorkersVillage);
    }

    public void play() {
        owner.addActions(2);
        owner.addAvailableBuys(1);
        owner.drawCards(1);
    }
}
