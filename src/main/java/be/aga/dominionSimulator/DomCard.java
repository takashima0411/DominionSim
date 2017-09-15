package be.aga.dominionSimulator;

import be.aga.dominionSimulator.cards.EstateCard;
import be.aga.dominionSimulator.enums.DomCardName;
import be.aga.dominionSimulator.enums.DomCardType;
import lombok.Data;

import java.util.Comparator;

@Data
public class DomCard implements Comparable<DomCard> {
    public static final Comparator<DomCard> SORT_BY_COST = Comparator.comparing(aO -> aO.getName().getCost());
    public static final Comparator<DomCard> SORT_FOR_TRASHING = Comparator.comparingInt(DomCard::getTrashPriority);
    public static final Comparator<DomCard> SORT_FOR_PLAYING = Comparator.comparingInt(DomCard::getPlayPriority);
    public static final Comparator<DomCard> SORT_FOR_DISCARDING = Comparator.comparingInt(aO -> aO.getDiscardPriority(1));
    public static final Comparator SORT_FOR_DISCARD_FROM_HAND = new Comparator<DomCard>() {
        @Override
        public int compare(DomCard aO1, DomCard aO2) {
            int theActionsLeft = aO1.owner.getActionsLeft();
            if (aO1.getDiscardPriority(theActionsLeft) < aO2.getDiscardPriority(theActionsLeft))
                return -1;
            if (aO1.getDiscardPriority(theActionsLeft) > aO2.getDiscardPriority(theActionsLeft))
                return 1;
            return 0;
        }
    };
    public DomPlayer owner = null;
    private DomCardName name;
    private boolean isFromBlackMarket = false;
    private boolean isTaggedByHerbalist;
    private boolean isBane = false;
    private boolean isTaggedByScheme;
    private boolean discardAtCleanUp = true;
    private boolean markedForPrince = false;
    private DomCard shapeshifterCard = null;
    private EstateCard estateCard;

    public DomCard(DomCardName aCardName) {
        name = aCardName;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return name.toHTML();
    }

    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    @Override
    public int compareTo(DomCard aO) {
        return Integer.compare(aO.getName().getCoinValue(), getName().getCoinValue());
    }

    public int getPlayPriority() {
        return name.getPlayPriority();
    }

    public int getDiscardPriority(int aActionsLeft) {
//    	//TODO problem with Royal Seal whic
//        if (aActionsLeft>0 && getTrashPriority()<16 && owner.getCardsFromHand(DomCardType.Trasher).size()>0)
//          //added this to make sure player keeps Curse in hand when he also has a Bishop for instance
//          return 36-getTrashPriority();
        return name.getDiscardPriority(aActionsLeft);
    }

    public int getVictoryValue() {
        return name.getVictoryValue(owner);
    }

    public int getTrashPriority() {
        return name.getTrashPriority();
    }

    public boolean wantsToBePlayed() {
        return true;
    }

    public void setOwner(DomPlayer aPlayer) {
        owner = aPlayer;
    }

    public void play() {
        owner.addAvailableCoinsSilent(getCoinValue());
        owner.availablePotions += getPotionValue();
    }

    public int getPotionValue() {
        return 0;
    }

    public int getCoinValue() {
        return name.getCoinValue();
    }

    public void resolveDuration() {
    }

    public int getCoinCost(DomGame aGame) {
        return name.getCoinCost(aGame);
    }

    public void handleCleanUpPhase() {
        if (!discardAtCleanUp()) {
            owner.addToCardsToStayInPlay(this);
            return;
        }
        if (isMarkedForPrince() && !hasCardType(DomCardType.Duration)) {
            if (shapeshifterCard != null)
                owner.setAsideForPrince(shapeshifterCard);
            else
                owner.setAsideForPrince(this);
            return;
        }

        if (isTaggedByHerbalist() || isTaggedByScheme()) {
            if (shapeshifterCard != null)
                owner.putOnTopOfDeck(shapeshifterCard);
            else
                owner.putOnTopOfDeck(this);
            //reset this boolean
            isTaggedByHerbalist = false;
            isTaggedByScheme = false;
            return;
        }
        owner.getDeck().discard(this);
    }

    public boolean hasCardType(DomCardType aType) {
        return name.hasCardType(aType);
    }

    public boolean discardAtCleanUp() {
        return discardAtCleanUp;
    }

    public int getPotionCost() {
        return name.getPotionCost();
    }

    public int getDebtCost() {
        return name.getDebtCost();
    }

    public DomCost getPotentialCurrencyValue() {
        return new DomCost((int) getPotentialCoinValue(), getPotionValue());
    }

    public double getPotentialCoinValue() {
        if (owner.getActionsLeft() == 0 && hasCardType(DomCardType.Action) && owner.getCardsInHand().contains(this)) {
            return 0;
        } else {
            return name.getCoinValue();
        }
    }

    public void setFromBlackMarket(boolean b) {
        isFromBlackMarket = b;
    }

    public void addHerbalistTag() {
        isTaggedByHerbalist = true;
    }

    public DomCost getCost(DomGame aDomGame) {
        return name.getCost(aDomGame);
    }

    public void setAsBane() {
        isBane = true;
    }

    public void doWhenGained() {
    }

    public void doWhenDiscarded() {
    }

    public void addSchemeTag() {
        isTaggedByScheme = true;
    }

    public void setDiscardAtCleanup(boolean b) {
        discardAtCleanUp = b;
    }

    public void doWhenTrashed() {
    }

    public void markForPrince() {
        markedForPrince = true;
    }

    public void setMarkedForPrince(boolean markedForPrince) {
        this.markedForPrince = markedForPrince;
    }

    public void doWhenCalled() {
    }

    public void cleanVariablesFromPreviousGames() {
    }

    public boolean mustStayInPlay() {
        return false;
    }

    public boolean wantsToBeMultiplied() {
        return true;
    }

    public DomCardName isFromPile() {
        return name.isFromPile();
    }
}
