package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

import java.util.Collections;

public class TradeRouteCard extends DomCard {
    public TradeRouteCard() {
        super(DomCardName.TradeRoute);
    }

    public void play() {
        owner.addAvailableBuys(1);
        owner.addAvailableCoins(owner.getCurrentGame().getBoard().countTradeRouteTokens());
        if (!owner.getCardsInHand().isEmpty()) {
            Collections.sort(owner.getCardsInHand(), SORT_FOR_TRASHING);
            owner.trash(owner.removeCardFromHand(owner.getCardsInHand().get(0)));
        }
    }
}
