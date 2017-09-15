package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class SprawlingCastleCard extends DomCard {
    public SprawlingCastleCard() {
        super(DomCardName.SprawlingCastle);
    }

    @Override
    public void doWhenGained() {
        if (owner.wants(DomCardName.Gardens) && owner.wants(DomCardName.Estate)) {
            gainEstates();
            return;
        }
        if (owner.getCurrentGame().countInSupply(DomCardName.Duchy) > 0)
            owner.gain(DomCardName.Duchy);
        else
            gainEstates();
    }

    private void gainEstates() {
        owner.gain(DomCardName.Estate);
        owner.gain(DomCardName.Estate);
        owner.gain(DomCardName.Estate);
    }

    @Override
    public int getTrashPriority() {
        return 55;
    }
}
