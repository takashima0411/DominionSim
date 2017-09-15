package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class GreatHallCard extends DomCard {
    public GreatHallCard() {
        super(DomCardName.GreatHall);
    }

    public void play() {
        owner.addActions(1);
        owner.drawCards(1);
    }

    @Override
    public int getTrashPriority() {
        //TODO this should be lower if we're in the greening stage!
        return super.getTrashPriority();
    }
}
