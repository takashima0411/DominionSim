package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class DistantLandsCard extends DomCard {
    public DistantLandsCard() {
        super(DomCardName.DistantLands);
    }

    @Override
    public void play() {
        if (!owner.getAllFromTavernMat(DomCardName.DistantLands).contains(this))
            owner.putOnTavernMat(owner.removeCardFromPlay(this));
    }

    @Override
    public int getTrashPriority() {
        if (owner != null && owner.wantsToGainOrKeep(DomCardName.DistantLands))
            return 42;
        return super.getTrashPriority();
    }

    @Override
    public int getVictoryValue() {
        if (owner.getAllFromTavernMat(DomCardName.DistantLands).isEmpty())
            return 0;
        return owner.getAllFromTavernMat(DomCardName.DistantLands).contains(this) ? 4 : 0;
    }
}
