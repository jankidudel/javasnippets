package org.jankidudel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    public void sort() {
        MergeSort mergeSort = new MergeSort();

        // ([3, 1, 50, 14, 33, 99, 2, 117, 44, 15]);
        Integer[] input = {3, 1, 50, 14, 33, 99, 2, 117, 44, 15};
        Integer[] expected = {1, 2, 3, 14, 15, 33, 44, 50, 99, 117};
        Integer[] actual = mergeSort.sort(input);
        Assertions.assertArrayEquals(expected, actual);
    }
}
