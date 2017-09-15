package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class CaravanGuardCard extends DomCard {
    public CaravanGuardCard() {
        super(DomCardName.CaravanGuard);
    }

    public void play() {
        owner.addActions(1);
        owner.drawCards(1);
    }

    public void resolveDuration() {
        owner.addAvailableCoins(1);
    }
}
