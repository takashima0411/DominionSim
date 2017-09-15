package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class NomadCampCard extends DomCard {
    public NomadCampCard() {
        super(DomCardName.NomadCamp);
    }

    public void play() {
        owner.addAvailableCoins(2);
        owner.addAvailableBuys(1);
    }
    //TODO gain on top of deck is handled in DomDeck, maybe handle here
}
