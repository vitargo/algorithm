package org.vitargo.algorithm;

public class HeapSortAlgorithm {

    public static void iteratively(final int[] array, final int count) {
        heapify(array, count);

        int end = count - 1;
        while (end > 0) {
            swap(array, end, 0);
            siftDown(array, 0, --end);
        }
    }

    private static void swap(final int[] array, final int a, final int b) {
        final int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private static void heapify(final int[] array, final int count) {
        int start = count / 2 - 1;

        while (start >= 0) {
            siftDown(array, start, count - 1);
            start--;
        }
    }

    private static void siftDown(final int[] array, final int start, final int end) {
        int root = start;

        while (root * 2 + 1 <= end) {
            int child = root * 2 + 1;
            int swap = root;
            if (array[swap] < array[child]) {
                swap = child;
            }
            if (child + 1 <= end && array[swap] < array[child + 1]) {
                swap = child + 1;
            }
            if (swap != root) {
                swap(array, root, swap);
                root = swap;
            } else {
                return;
            }
        }
    }
}
