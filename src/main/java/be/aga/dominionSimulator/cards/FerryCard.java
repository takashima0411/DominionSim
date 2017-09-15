package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class FerryCard extends DomCard {

    public FerryCard() {
      super( DomCardName.Ferry);
    }

    public void play() {
        owner.placeMinus$2Token();
    }
}
