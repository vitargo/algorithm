package org.vitargo.algorithm;

public class BinarySearchAlgorithm {

    /**
     * Class	Search algorithm
     * Data structure	Array
     * Worst-case performance	O(log n)
     * Best-case performance	O(1)
     * Average performance	O(log n)
     * Worst-case space complexity	O(1)
    */

    public static int iteratively(int[] sortedArray, int key){
        int index = -1;
        int min = 0;
        int max = sortedArray.length-1;

        while (min <= max){
            int mid = min + ((max-min)/2);
            if(sortedArray[mid] < key){
                min = mid + 1;
            } else if (sortedArray[mid] > key){
                max = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
    return index;
    }

    public static int recursively(int[] sortedArray, int key, int min, int max){
        if(max < min) {
            return -1;
        }
        int mid = min + ((max-min)/2);

        if (sortedArray[mid] == key){
            return mid;
        } else if (sortedArray[mid] < key){
            return recursively(sortedArray, key, mid + 1, max);
        } else {
            return recursively(sortedArray, key, min, mid - 1);
        }
    }
}
