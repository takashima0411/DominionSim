package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class BanditCampCard extends DomCard {
    public BanditCampCard() {
        super(DomCardName.BanditCamp);
    }

    public void play() {
        owner.drawCards(1);
        owner.addActions(2);
        owner.gain(DomCardName.Spoils);
    }
}
