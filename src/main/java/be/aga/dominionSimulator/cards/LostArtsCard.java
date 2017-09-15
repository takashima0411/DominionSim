package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class LostArtsCard extends DomCard {

    public LostArtsCard() {
        super(DomCardName.LostArts);
    }

    public void play() {
        owner.placePlusOneActionToken();
    }
}
