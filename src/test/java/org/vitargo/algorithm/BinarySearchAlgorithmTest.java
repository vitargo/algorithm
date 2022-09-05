package org.vitargo.algorithm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchAlgorithmTest {

    int[] sortedArrayBig = new int[] {2, 5, 8, 11, 55, 89, 101, 102, 155, 390, 444, 677};
    int[] sortedArrayMiddle = new int[] {2, 5, 8, 11, 55, 2234, 55555};
    int[] sortedArraySmall = new int[] {2};
    int[] sortedArrayEmpty = new int[0];

    @Test
    void iterativelyBig() {
        int key = 55;
        int expected = 4;

        int actaul = BinarySearchAlgorithm.iteratively(sortedArrayBig, key);

        Assertions.assertEquals(expected, actaul);
    }

    @Test
    void iterativelyMiddle() {
        int key = 2234;
        int expected = 5;

        int actaul = BinarySearchAlgorithm.iteratively(sortedArrayMiddle, key);

        Assertions.assertEquals(expected, actaul);
    }

    @Test
    void iterativelySmall() {
        int key = 2;
        int expected = 0;

        int actaul = BinarySearchAlgorithm.iteratively(sortedArraySmall, key);

        Assertions.assertEquals(expected, actaul);
    }

    @Test
    void iterativelyEmpty() {
        int key = 9;
        int expected = -1;

        int actaul = BinarySearchAlgorithm.iteratively(sortedArrayEmpty, key);

        Assertions.assertEquals(expected, actaul);
    }

    // ---- RECURSION----

    @Test
    void recursivelyBig() {
        int key = 55;
        int expected = 4;

        int actaul = BinarySearchAlgorithm.recursively(sortedArrayBig, key, 0, sortedArrayBig.length);

        Assertions.assertEquals(expected, actaul);
    }

    @Test
    void recursivelyMiddle() {
        int key = 2234;
        int expected = 5;

        int actaul = BinarySearchAlgorithm.recursively(sortedArrayMiddle, key, 0, sortedArrayMiddle.length);

        Assertions.assertEquals(expected, actaul);
    }

    @Test
    void recursivelySmall() {
        int key = 2;
        int expected = 0;

        int actaul = BinarySearchAlgorithm.recursively(sortedArraySmall, key, 0, sortedArraySmall.length);

        Assertions.assertEquals(expected, actaul);
    }

    @Test
    void recursivelyEmpty() {
        int key = 9;
        int expected = -1;

        int actaul = BinarySearchAlgorithm.recursively(sortedArrayEmpty, key, 0, sortedArrayEmpty.length);

        Assertions.assertEquals(expected, actaul);
    }
}