package org.jankidudel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    public void sort() {
        BubbleSort bubbleSort = new BubbleSort();

        Integer[] input = {30, 22, 40, 10, 6};
        Integer[] expected = {6, 10, 22, 30, 40};
        Integer[] actual = bubbleSort.sort(input);
        Assertions.assertArrayEquals(expected, actual);
    }
}