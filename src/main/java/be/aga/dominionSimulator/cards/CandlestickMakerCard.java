package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class CandlestickMakerCard extends DomCard {
    public CandlestickMakerCard() {
        super(DomCardName.CandlestickMaker);
    }

    public void play() {
        owner.addActions(1);
        owner.addCoinTokens(1);
        owner.addAvailableBuys(1);
    }
}
