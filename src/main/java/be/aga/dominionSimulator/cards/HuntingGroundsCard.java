package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;


public class HuntingGroundsCard extends DomCard {
    public HuntingGroundsCard() {
        super(DomCardName.HuntingGrounds);
    }

    public void play() {
        owner.drawCards(4);
    }

    @Override
    public void doWhenTrashed() {
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
    public int getPlayPriority() {
        return owner.getActionsLeft() > 1 ? 6 : super.getPlayPriority();
    }
}
