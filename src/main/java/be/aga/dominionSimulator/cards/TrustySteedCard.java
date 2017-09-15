package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class TrustySteedCard extends DomCard {
    public TrustySteedCard() {
        super(DomCardName.TrustySteed);
    }

    public void play() {
        if (owner.getActionsLeft() > 1) {
            owner.addAvailableCoins(2);
        } else {
            owner.addActions(2);
        }
        owner.drawCards(2);
    }
}
