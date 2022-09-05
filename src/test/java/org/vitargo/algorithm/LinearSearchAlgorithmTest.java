package org.vitargo.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchAlgorithmTest {

    int[] sortedArrayBig = new int[] {2, 5, 8, 11, 55, 89, 101, 102, 155, 390, 444, 677};
    int[] sortedArrayMiddle = new int[] {2, 5, 8, 11, 55, 2234, 55555};
    int[] sortedArraySmall = new int[] {2};
    int[] sortedArrayEmpty = new int[0];

    @Test
    void iterativelyBig() {
        int key = 102;
        int exp = 7;

        int act = LinearSearchAlgorithm.iteratively(sortedArrayBig, key);

        Assertions.assertEquals(exp, act);
    }

    @Test
    void iterativelyMiddle() {
        int key = 55555;
        int exp = 6;

        int act = LinearSearchAlgorithm.iteratively(sortedArrayMiddle, key);

        Assertions.assertEquals(exp, act);
    }

    @Test
    void iterativelySmall() {
        int key = 2;
        int exp = 0;

        int act = LinearSearchAlgorithm.iteratively(sortedArraySmall, key);

        Assertions.assertEquals(exp, act);
    }

    @Test
    void iterativelyEmpty() {
        int key = 102;
        int exp = -1;

        int act = LinearSearchAlgorithm.iteratively(sortedArrayEmpty, key);

        Assertions.assertEquals(exp, act);
    }

    @Test
    void recursivelyBig() {
        int key = 102;
        int exp = 7;

        int act = LinearSearchAlgorithm.recursively(sortedArrayBig, sortedArrayBig.length, key);

        Assertions.assertEquals(exp, act);
    }

    @Test
    void recursivelyMiddle() {
        int key = 55555;
        int exp = 6;

        int act = LinearSearchAlgorithm.recursively(sortedArrayMiddle, sortedArrayMiddle.length, key);

        Assertions.assertEquals(exp, act);
    }

    @Test
    void recursivelySmall() {
        int key = 2;
        int exp = 0;

        int act = LinearSearchAlgorithm.recursively(sortedArraySmall, sortedArraySmall.length, key);

        Assertions.assertEquals(exp, act);
    }

    @Test
    void recursivelyEmpty() {
        int key = 102;
        int exp = -1;

        int act = LinearSearchAlgorithm.recursively(sortedArrayEmpty, sortedArrayEmpty.length, key);

        Assertions.assertEquals(exp, act);
    }
}