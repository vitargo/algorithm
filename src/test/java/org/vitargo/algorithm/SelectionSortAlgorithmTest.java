package org.vitargo.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortAlgorithmTest {

    private static final int[] ARRAY_BIG = new int[] {5, 6, 2, 8, 1, 0, -1, 3, 9, 4, 10, 7};
    private static final int[] ARRAY_BIG_SORTED_ASC = new int[] {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final int[] ARRAY_BIG_SORTED_DES = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1};
    private static final int[] ARRAY_EMPTY = new int[0];

    @Test
    void sortAscending() {
        int[] act = SelectionSortAlgorithm.sortAscending(ARRAY_BIG);

        Assertions.assertArrayEquals(ARRAY_BIG_SORTED_ASC, act);
    }

    @Test
    void sortAscendingEmpty() {
        int[] act = SelectionSortAlgorithm.sortAscending(ARRAY_EMPTY);

        Assertions.assertArrayEquals(ARRAY_EMPTY, act);
    }

    @Test
    void sortDescending() {
        int[] act = SelectionSortAlgorithm.sortDescending(ARRAY_BIG);

        Assertions.assertArrayEquals(ARRAY_BIG_SORTED_DES, act);
    }

    @Test
    void sortDescendingEmpty() {
        int[] act = SelectionSortAlgorithm.sortDescending(ARRAY_EMPTY);

        Assertions.assertArrayEquals(ARRAY_EMPTY, act);
    }
}