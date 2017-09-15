package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class KingsCastleCard extends DomCard {
    public KingsCastleCard() {
        super(DomCardName.KingsCastle);
    }

    @Override
    public int getTrashPriority() {
        return 70;
    }
}
