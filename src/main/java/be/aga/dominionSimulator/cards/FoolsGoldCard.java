package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class FoolsGoldCard extends DomCard {
    public FoolsGoldCard() {
        super(DomCardName.FoolsGold);
    }

    public void play() {
        if (owner.getCardsFromPlay(DomCardName.FoolsGold).size() > 1) {
            owner.addAvailableCoins(4);
        } else {
            owner.addAvailableCoins(1);
        }
    }
    //TODO reaction part is handled in ProvinceCard, maybe handle here

    @Override
    public double getPotentialCoinValue() {
        //TODO needs checking (probably not correct)
        if (!owner.getCardsInHand().contains(this) && !owner.getCardsInPlay().contains(this))
            return owner.countInDeck(DomCardName.FoolsGold);
        double theNumberOfFG = owner.getCardsFromPlay(DomCardName.FoolsGold).size() + owner.getCardsFromHand(DomCardName.FoolsGold).size();
        if (theNumberOfFG == 0)
            return 0;
        return (1 + 4 * (theNumberOfFG - 1)) / theNumberOfFG;
    }
}
