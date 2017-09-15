package be.aga.dominionSimulator;

import be.aga.dominionSimulator.enums.DomCardName;
import org.junit.jupiter.api.Test;

import static be.aga.dominionSimulator.DomCard.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomCardTest {

    @Test
    void sortByCostShouldReturns1AtLeftGraterThanRight() {
        assertEquals(-1, SORT_BY_COST.compare(new DomCard(DomCardName.Copper), new DomCard(DomCardName.Silver)));
    }

    @Test
    void sortByCostShouldReturns0AtLeftEqualsRight() {
        assertEquals(0, SORT_BY_COST.compare(new DomCard(DomCardName.Copper), new DomCard(DomCardName.Copper)));
    }

    @Test
    void sortByCostShouldReturnsMinus1AtLeftSmallerThanRight() {
        assertEquals(1, SORT_BY_COST.compare(new DomCard(DomCardName.Silver), new DomCard(DomCardName.Copper)));
    }

    @Test
    void sortByTrashingShouldReturns1AtLeftGraterThanRight() {
        assertEquals(-1, SORT_FOR_TRASHING.compare(new DomCard(DomCardName.Copper), new DomCard(DomCardName.Silver)));
    }

    @Test
    void sortByTrashingShouldReturns0AtLeftEqualsRight() {
        assertEquals(0, SORT_FOR_TRASHING.compare(new DomCard(DomCardName.Copper), new DomCard(DomCardName.Copper)));
    }

    @Test
    void sortByTrashingShouldReturnsMinus1AtLeftSmallerThanRight() {
        assertEquals(1, SORT_FOR_TRASHING.compare(new DomCard(DomCardName.Silver), new DomCard(DomCardName.Copper)));
    }

    @Test
    void sortByPlayingShouldReturns1AtLeftGraterThanRight() {
        assertEquals(-1, SORT_FOR_PLAYING.compare(new DomCard(DomCardName.Copper), new DomCard(DomCardName.Silver)));
    }

    @Test
    void sortByPlayingShouldReturns0AtLeftEqualsRight() {
        assertEquals(0, SORT_FOR_PLAYING.compare(new DomCard(DomCardName.Copper), new DomCard(DomCardName.Copper)));
    }

    @Test
    void sortByPlayingShouldReturnsMinus1AtLeftSmallerThanRight() {
        assertEquals(1, SORT_FOR_PLAYING.compare(new DomCard(DomCardName.Silver), new DomCard(DomCardName.Copper)));
    }

    @Test
    void sortByDiscardingShouldReturns1AtLeftGraterThanRight() {
        assertEquals(-1, SORT_FOR_DISCARDING.compare(new DomCard(DomCardName.Copper), new DomCard(DomCardName.Silver)));
    }

    @Test
    void sortByDiscardingShouldReturns0AtLeftEqualsRight() {
        assertEquals(0, SORT_FOR_DISCARDING.compare(new DomCard(DomCardName.Copper), new DomCard(DomCardName.Copper)));
    }

    @Test
    void sortByDiscardingShouldReturnsMinus1AtLeftSmallerThanRight() {
        assertEquals(1, SORT_FOR_DISCARDING.compare(new DomCard(DomCardName.Silver), new DomCard(DomCardName.Copper)));
    }

    @Test
    void compareToShouldReturns1AtLeftGraterThanRight() {
        DomCard left = new DomCard(DomCardName.Copper);
        DomCard right = new DomCard(DomCardName.Silver);
        assertEquals(1, left.compareTo(right));
    }

    @Test
    void compareToShouldReturns0AtLeftEqualsRight() {
        DomCard left = new DomCard(DomCardName.Copper);
        DomCard right = new DomCard(DomCardName.Copper);
        assertEquals(0, left.compareTo(right));
    }

    @Test
    void compareToFromHandShouldReturnsMinus1AtLeftSmallerThanRight() {
        DomCard left = new DomCard(DomCardName.Silver);
        DomCard right = new DomCard(DomCardName.Copper);
        assertEquals(-1, left.compareTo(right));
    }
}
