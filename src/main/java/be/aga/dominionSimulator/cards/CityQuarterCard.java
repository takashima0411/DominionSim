package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

public class CityQuarterCard extends DomCard {
    public CityQuarterCard() {
        super(DomCardName.CityQuarter);
    }

    public void play() {
        owner.addActions(2);
        int theNumberOfActions = owner.getCardsFromHand(DomCardType.Action).size();
        if (theNumberOfActions > 0)
            owner.drawCards(theNumberOfActions);
    }

    @Override
    public int getPlayPriority() {
        if (owner.getDeckSize() == 0)
            return 1000;
        for (DomCard theCard : owner.getCardsInHand()) {
            if (owner.getActionsLeft() > 1 && theCard != this && theCard.hasCardType(DomCardType.CardAdvantage) && theCard.wantsToBePlayed() && owner.getCardsFromHand(DomCardType.Action).size() < 4)
                return theCard.getPlayPriority() + 1;
        }
        return super.getPlayPriority();
    }
}
