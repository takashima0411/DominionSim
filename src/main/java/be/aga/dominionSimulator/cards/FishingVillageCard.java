package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class FishingVillageCard extends DomCard {
    public FishingVillageCard() {
        super(DomCardName.FishingVillage);
    }

    public void play() {
        owner.addActions(2);
        owner.addAvailableCoins(1);
    }

    public void resolveDuration() {
        owner.addActions(1);
        owner.addAvailableCoins(1);
    }
}
