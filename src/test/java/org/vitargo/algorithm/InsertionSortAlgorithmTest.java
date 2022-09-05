package org.vitargo.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortAlgorithmTest {
    private static int[] ARRAY_BIG;
    private static int[] ARRAY;
    private static final int[] ARRAY_BIG_SORTED_ASC = new int[] {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private static final int[] ARRAY_EMPTY = new int[0];

    @BeforeEach
    void setUp(){
        ARRAY_BIG = new int[] {5, 6, 2, 8, 1, 0, -1, 3, 9, 4, 10, 7};
        ARRAY = new int[0];
    }

    @Test
    void iteratively() {
        InsertionSortAlgorithm.iteratively(ARRAY_BIG);

        Assertions.assertArrayEquals(ARRAY_BIG_SORTED_ASC, ARRAY_BIG);
    }

    @Test
    void iterativelyEmpty() {
        InsertionSortAlgorithm.iteratively(ARRAY);

        Assertions.assertArrayEquals(ARRAY_EMPTY, ARRAY);
    }

    @Test
    void recursively() {
        InsertionSortAlgorithm.recursively(ARRAY_BIG, ARRAY_BIG.length);

        Assertions.assertArrayEquals(ARRAY_BIG_SORTED_ASC, ARRAY_BIG);
    }

    @Test
    void recursivelyEmpty() {
        InsertionSortAlgorithm.recursively(ARRAY, ARRAY.length);

        Assertions.assertArrayEquals(ARRAY_EMPTY, ARRAY);
    }
}