package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

public class OpulentCastleCard extends DomCard {
    public OpulentCastleCard() {
        super(DomCardName.OpulentCastle);
    }

    public void play() {
        int amount = 0;
        while (!owner.getCardsFromHand(DomCardType.Victory).isEmpty()) {
            owner.discardFromHand(owner.getCardsFromHand(DomCardType.Victory).get(0));
            amount += 2;
        }
        if (amount > 0)
            owner.addAvailableCoins(amount);
    }

    @Override
    public int getDiscardPriority(int aActionsLeft) {
        if (aActionsLeft > 0 && owner.getCardsInHand().contains(this)
                && owner.getCardsFromHand(DomCardName.OpulentCastle).size() == 1 && owner.getCardsFromHand(DomCardType.Victory).size() > 1)
            return 29;
        return super.getDiscardPriority(aActionsLeft);
    }

}
