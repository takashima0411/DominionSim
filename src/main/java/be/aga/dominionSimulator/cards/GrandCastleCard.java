package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomEngine;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

public class GrandCastleCard extends DomCard {
    public GrandCastleCard() {
        super(DomCardName.GrandCastle);
    }

    @Override
    public void doWhenGained() {
        if (owner.getCardsFromHand(DomCardType.Victory).isEmpty() && owner.getCardsFromPlay(DomCardType.Victory).isEmpty()) {
            if (DomEngine.haveToLog) DomEngine.addToLog(owner + " reveals no Victory Cards so doesn't gain VP tokens");
            return;
        }
        if (DomEngine.haveToLog)
            DomEngine.addToLog(owner + " reveals " + owner.getCardsFromHand(DomCardType.Victory) + " from hand and " + owner.getCardsFromPlay(DomCardType.Victory) + " from play");
        owner.addVP(owner.getCardsFromHand(DomCardType.Victory).size() + owner.getCardsFromPlay(DomCardType.Victory).size());
    }

    @Override
    public int getTrashPriority() {
        return 59;
    }
}
