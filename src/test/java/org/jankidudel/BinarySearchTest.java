package org.jankidudel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    public void search() {
        BinarySearch binarySearch = new BinarySearch();

        Integer[] input = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91, 93};

        int expected = 6;
        int actual = binarySearch.search(input, 38);
        Assertions.assertEquals(expected, actual);

        Assertions.assertEquals(-1, binarySearch.search(input, 333));
    }
}
