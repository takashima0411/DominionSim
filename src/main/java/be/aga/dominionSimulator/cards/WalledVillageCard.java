package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class WalledVillageCard extends DomCard {
    public WalledVillageCard() {
        super(DomCardName.WalledVillage);
    }

    public void play() {
        owner.addActions(2);
        owner.drawCards(1);
    }

    @Override
    public void handleCleanUpPhase() {
        if (owner.getCurrentGame().countActionsInPlay() <= 2)
            owner.putOnTopOfDeck(this);
        else
            super.handleCleanUpPhase();
    }
}
