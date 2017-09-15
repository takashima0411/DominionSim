package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class RuinedVillageCard extends DomCard {

    public RuinedVillageCard() {
        super(DomCardName.RuinedVillage);
    }

    @Override
    public void play() {
        owner.addActions(1);
    }
}
