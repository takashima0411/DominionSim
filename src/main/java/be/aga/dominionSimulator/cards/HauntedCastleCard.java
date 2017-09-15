package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomPlayer;
import be.aga.dominionSimulator.enums.DomCardName;

public class HauntedCastleCard extends DomCard {
    public HauntedCastleCard() {
        super(DomCardName.HauntedCastle);
    }

    @Override
    public void doWhenGained() {
        if (owner.getCurrentGame().getActivePlayer() != owner)
            return;
        owner.gain(DomCardName.Gold);
        for (DomPlayer thePlayer : owner.getOpponents()) {
            if (thePlayer.getCardsInHand().size() >= 5)
                thePlayer.doForcedDiscard(2, true);
        }
    }

    @Override
    public int getTrashPriority() {
        return 45;
    }
}
