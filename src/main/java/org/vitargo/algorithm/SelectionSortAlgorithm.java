package org.vitargo.algorithm;

public class SelectionSortAlgorithm {

    public static int[] sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (min != i){
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return array;
    }

    public static int[] sortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[max] < array[j]) {
                    max = j;
                }
            }
            if (max != i){
                int temp = array[i];
                array[i] = array[max];
                array[max] = temp;
            }
        }
        return array;
    }
}
