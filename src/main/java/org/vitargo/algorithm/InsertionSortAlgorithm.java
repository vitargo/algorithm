package org.vitargo.algorithm;

public class InsertionSortAlgorithm {

    public static void iteratively(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void recursively(int[] array, int i){
        if( i <= 1){
            return;
        }
        recursively(array, i - 1);
        int key = array[i-1];
        int j = i - 2;
        while(j >= 0 && array[j] > key){
            array[j + 1] = array[j];
            j = j - 1;
        }
        array[j + 1] = key;
    }
}
