package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class HumbleCastleCard extends DomCard {
    public HumbleCastleCard() {
        super(DomCardName.HumbleCastle);
    }

    @Override
    public int getTrashPriority() {
        return 43;
    }
}
