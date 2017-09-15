package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomPlayer;
import be.aga.dominionSimulator.enums.DomCardName;

public class TreasureMapCard extends DomCard {
    public TreasureMapCard() {
        super(DomCardName.TreasureMap);
    }

    public void play() {
        DomPlayer theOwner = owner;
        theOwner.trash(theOwner.removeCardFromPlay(this));
        if (theOwner.getCardsFromHand(DomCardName.TreasureMap).size() > 0) {
            theOwner.trash(theOwner.removeCardFromHand(theOwner.getCardsFromHand(DomCardName.TreasureMap).get(0)));
            for (int i = 0; i < 4; i++) {
                DomCard theGold = theOwner.getCurrentGame().takeFromSupply(DomCardName.Gold);
                if (theGold != null) {
                    theOwner.gainOnTopOfDeck(theGold);
                }
            }
        }
    }

    public boolean wantsToBePlayed() {
        if (owner.getCardsFromHand(DomCardName.TreasureMap).size() > 1)
            return true;
        if (owner.countInDeck(DomCardName.Gold) > 0)
            return true;
        return false;
    }

    @Override
    public int getDiscardPriority(int aActionsLeft) {
        if (owner.getCardsInHand().contains(this))
            return wantsToBePlayed() ? 50 : 5;
        return super.getDiscardPriority(1);
    }
}
