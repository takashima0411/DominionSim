package be.aga.dominionSimulator.cards;

import be.aga.dominionSimulator.DomCard;
import be.aga.dominionSimulator.DomEngine;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;

public class DiplomatCard extends DomCard {
    public DiplomatCard() {
      super( DomCardName.Diplomat);
    }

    public void play() {
      owner.drawCards(2);
      if (owner.getCardsInHand().size()<=5)
          owner.addActions(2);
    }

    public void react() {
       if (owner.getCardsInHand().size()<5)
           return;
       if (DomEngine.haveToLog) DomEngine.addToLog( owner + " reveals " + this );
       owner.drawCards(2);
       owner.doForcedDiscard(3,false);
    }

    @Override
    public int getPlayPriority() {
        if (owner.getCardsInHand().size()<=4)
            return 1;
        return super.getPlayPriority();
    }

    @Override
    public boolean hasCardType(DomCardType aType) {
        if (aType==DomCardType.Village && owner.getCardsInHand().size()<=4 && owner.getCardsInHand().contains(this) )
            return true;
        return super.hasCardType(aType);
    }
}
