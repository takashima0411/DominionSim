package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class SilkRoadCard extends DomCard {
    public SilkRoadCard() {
        super(DomCardName.SilkRoad);
    }

    @Override
    public int getTrashPriority() {
        if (owner != null && owner.wantsToGainOrKeep(DomCardName.SilkRoad))
            return 40;

        return super.getTrashPriority();
    }
}
