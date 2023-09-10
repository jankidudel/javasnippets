package org.jankidudel;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Integer[] bubbleSortInput = {10, 41, 7, 3, 99};
//        Integer[] bubbleSortResponse = (new BubbleSort()).sort(bubbleSortInput);
//        System.out.println("Bubble sort response: " + Arrays.toString(bubbleSortResponse));



        // [3, 1, 50, 14, 33, 99, 2, 117, 44, 15])

        Integer[] mergeSortInput = {3, 1, 50, 14, 33, 99, 2, 117, 44, 15};
        Integer[] mergeSortResponse = (new MergeSort()).sort(mergeSortInput);
        System.out.println("Merge sort response: " + Arrays.toString(mergeSortResponse));




    }
}