package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class CrumblingCastleCard extends DomCard {
    public CrumblingCastleCard() {
        super(DomCardName.CrumblingCastle);
    }

    @Override
    public void doWhenTrashed() {
        owner.addVP(1);
        owner.gain(DomCardName.Silver);
    }

    @Override
    public void doWhenGained() {
        owner.addVP(1);
        owner.gain(DomCardName.Silver);
    }
}
