package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.enums.DomCardName;

public class RuinedLibraryCard extends DomCard {

    public RuinedLibraryCard() {
        super(DomCardName.RuinedLibrary);
    }

    @Override
    public void play() {
        owner.drawCards(1);
    }
}
