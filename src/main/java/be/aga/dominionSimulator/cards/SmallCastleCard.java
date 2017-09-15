package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomPlayer;
import be.aga.dominionSimulator.enums.DomCardName;


public class SmallCastleCard extends DomCard {
    public SmallCastleCard() {
        super(DomCardName.SmallCastle);
    }

    public void play() {
        DomPlayer theOwner = owner;
        if (owner == null)
            return;
        if (owner.getCardsFromHand(DomCardName.CrumblingCastle).isEmpty()) {
            if (owner.getCardsFromPlay(getName()).contains(this))
                owner.trash(owner.removeCardFromPlay(this));
        } else {
            owner.trash(owner.removeCardFromHand(owner.getCardsFromHand(DomCardName.CrumblingCastle).get(0)));
        }
        theOwner.gain(DomCardName.Castles);
    }

    @Override
    public boolean wantsToBePlayed() {
        return owner.getCurrentGame().countInSupply(DomCardName.Castles) > 0;
    }

    @Override
    public int getTrashPriority() {
        return 38;
    }

    @Override
    public int getDiscardPriority(int aActionsLeft) {
        if (wantsToBePlayed() && aActionsLeft > 0)
            return 22;
        else
            return super.getDiscardPriority(aActionsLeft);
    }

    @Override
    public int getPlayPriority() {
        if (owner.getCurrentGame().countInSupply(DomCardName.Castles) <= 2)
            return 22;
        return super.getPlayPriority();
    }
}
