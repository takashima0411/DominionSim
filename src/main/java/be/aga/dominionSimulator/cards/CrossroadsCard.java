package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

public class CrossroadsCard extends DomCard {
    public CrossroadsCard() {
        super(DomCardName.Crossroads);
    }

    public void play() {
        if (owner.getCardsFromPlay(DomCardName.Crossroads).size() == 1)
            owner.addActions(3);
        owner.drawCards(owner.getCardsFromHand(DomCardType.Victory).size());
    }

    @Override
    public int getPlayPriority() {
        //TODO probably doesn't cover everything
        if (owner.getCardsFromHand(DomCardType.Action).size()
                - owner.getCardsFromHand(DomCardName.Crossroads).size()
                - owner.getCardsFromHand(DomCardName.Nobles).size()
                - owner.getCardsFromHand(DomCardName.GreatHall).size()
                - owner.getCardsFromHand(DomCardName.Mill).size()
                > owner.getCardsFromHand(DomCardType.Terminal).size())
            return 30;
        return super.getPlayPriority();
    }

    @Override
    public boolean wantsToBePlayed() {
        if (owner.getCardsFromPlay(DomCardName.Crossroads).isEmpty())
            return true;
        if (owner.getActionsLeft() == 1 && !owner.getCardsFromHand(DomCardName.SecretChamber).isEmpty())
            return false;
        return true;
    }
}
