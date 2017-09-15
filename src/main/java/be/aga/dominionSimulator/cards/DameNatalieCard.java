package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCost;
import be.aga.dominionSimulator.enums.DomCardName;

public class DameNatalieCard extends KnightCard {

    public DameNatalieCard() {
        super(DomCardName.DameNatalie);
    }

    public void play() {
        DomCardName theDesiredCard = owner.getDesiredCard(new DomCost(3, 0), false);
        if (theDesiredCard != null)
            owner.gain(theDesiredCard);
        super.play();
    }
}
