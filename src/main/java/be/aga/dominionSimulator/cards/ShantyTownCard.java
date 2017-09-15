package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

public class ShantyTownCard extends DomCard {
    public ShantyTownCard() {
        super(DomCardName.ShantyTown);
    }

    public void play() {
        owner.addActions(2);
        owner.showHand();
        if (owner.getCardsFromHand(DomCardType.Action).isEmpty())
            owner.drawCards(2);
    }

    @Override
    public int getPlayPriority() {
        if (wantsToBePlayed())
            return 0;
        return 1000;
    }

    @Override
    public boolean wantsToBePlayed() {
        int theIndex = owner.getCardsInHand().indexOf(this);
        if (theIndex < 0)
            //possible if played by Golem
            return true;
        //we remove this Shanty Town temporarily to make checks easier
        owner.getCardsInHand().remove(this);

        boolean wantsToBePlayed = false;

        if (owner.getCardsFromHand(DomCardType.Action).size() == 0)
            wantsToBePlayed = true;

        if (owner.getCardsFromHand(DomCardName.ShantyTown).size() > 0)
            wantsToBePlayed = true;

        if (owner.getActionsLeft() == 1
                && !owner.getCardsFromHand(DomCardName.Minion).isEmpty())
            wantsToBePlayed = true;

        if (owner.getActionsLeft() == 1
                && owner.getCardsFromHand(DomCardType.Terminal).size() >= 2
                && owner.getCardsFromHand(DomCardType.Action).size() == owner.getCardsFromHand(DomCardType.Terminal).size())
            wantsToBePlayed = true;

        if (owner.getActionsLeft() == 1
                && owner.getCardsFromHand(DomCardType.CardAdvantage).size() >= 1
                && owner.getCardsFromHand(DomCardType.Action).size() == owner.getCardsFromHand(DomCardType.CardAdvantage).size())
            wantsToBePlayed = true;

        if (owner.getActionsLeft() == 1
                && owner.getCardsFromHand(DomCardType.Terminal).size() == 1
                && owner.getCardsFromHand(DomCardType.Action).size() == 1
                && owner.getCardsFromHand(DomCardName.HornOfPlenty).size() > 0)
            wantsToBePlayed = true;

        if (owner.getActionsLeft() == 1
                && owner.getCardsFromHand(DomCardName.YoungWitch).size() == owner.getCardsFromHand(DomCardType.Action).size())
            wantsToBePlayed = true;

        owner.getCardsInHand().add(theIndex, this);

        return wantsToBePlayed;
    }
}
