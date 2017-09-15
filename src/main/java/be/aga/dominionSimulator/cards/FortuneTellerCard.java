package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomPlayer;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

import java.util.ArrayList;

public class FortuneTellerCard extends DomCard {
    public FortuneTellerCard() {
        super(DomCardName.FortuneTeller);
    }

    @Override
    public void play() {
        owner.addAvailableCoins(2);
        for (DomPlayer thePlayer : owner.getOpponents()) {
            if (thePlayer.checkDefense())
                continue;
            ArrayList<DomCard> theRevealedCards = thePlayer.revealUntilVictoryOrCurse();
            for (DomCard theCard : theRevealedCards) {
                if (theCard.hasCardType(DomCardType.Victory) || theCard.hasCardType(DomCardType.Curse)) {
                    thePlayer.putOnTopOfDeck(theCard);
                } else {
                    thePlayer.discard(theCard);
                }
            }
        }
    }
}
