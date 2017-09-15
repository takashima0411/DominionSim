package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

import java.util.ArrayList;

public class FarmingVillageCard extends DomCard {
    public FarmingVillageCard() {
        super(DomCardName.FarmingVillage);
    }

    public void play() {
        owner.addActions(2);
        ArrayList<DomCard> theRevealedCards = owner.revealUntilActionOrTreasure();
        for (DomCard theCard : theRevealedCards) {
            if (theCard.hasCardType(DomCardType.Action) || theCard.hasCardType(DomCardType.Treasure)) {
                owner.putInHand(theCard);
            } else {
                owner.discard(theCard);
            }
        }
    }
}
