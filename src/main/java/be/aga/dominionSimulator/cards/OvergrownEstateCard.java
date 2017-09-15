package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class OvergrownEstateCard extends DomCard {
    public OvergrownEstateCard() {
        super(DomCardName.OvergrownEstate);
    }

    @Override
    public void doWhenTrashed() {
        owner.drawCards(1);
    }

    @Override
    public int getTrashPriority() {
        return 1;
    }
}
