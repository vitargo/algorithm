package org.vitargo.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortAlgorithmTest {

    private static int[] ARRAY_BIG;
    private static int[] ARRAY;
    private static final int[] ARRAY_BIG_SORTED_ASC = new int[] {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final int[] ARRAY_EMPTY = new int[0];

    @BeforeEach
    void setUp() {
        ARRAY_BIG = new int[] {5, 6, 2, 8, 1, 0, -1, 3, 9, 4, 10, 7};
        ARRAY = new int[0];
    }

    @Test
    void quickSort() {
        QuickSortAlgorithm.quickSort(ARRAY_BIG, 0, ARRAY_BIG.length-1);

        Assertions.assertArrayEquals(ARRAY_BIG_SORTED_ASC, ARRAY_BIG);
    }
}