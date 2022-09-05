package org.vitargo.algorithm;

public class LinearSearchAlgorithm {

    public static int iteratively(int[] array, int key){
        int index = -1;

        for(int i = 0; i < array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return index;
    }

    public static int recursively(int[] array, int size, int key){
        if(size == 0){
            return -1;
        }

        if (array[size-1] == key){
            return size-1;
        } else {
            return recursively(array, size-1, key);
        }
    }
}
