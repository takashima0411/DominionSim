package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class MessengerCard extends DomCard {
    public MessengerCard() {
        super(DomCardName.Messenger);
    }

    public void play() {
        owner.addAvailableCoins(2);
        owner.addAvailableBuys(1);
        owner.putDeckInDiscard();
    }

    @Override
    public int getPlayPriority() {
        if (owner.getActionsLeft() > 1)
            return DomCardName.CountingHouse.getPlayPriority() - 1;
        return super.getPlayPriority();
    }
}
