package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class RoyalBlacksmithCard extends DomCard {
    public RoyalBlacksmithCard() {
        super(DomCardName.RoyalBlacksmith);
    }

    @Override
    public void play() {
        owner.drawCards(5);
        while (!owner.getCardsFromHand(DomCardName.Copper).isEmpty())
            owner.discardFromHand(DomCardName.Copper);
    }

    @Override
    public int getPlayPriority() {
        return owner.getActionsLeft() > 1 ? 6 : super.getPlayPriority();
    }
}
