package org.jankidudel;

class BinarySearch {
    public int search(Integer[] input, int searchElem) {
        int leftBoundary = 0;
        int rightBoundary = input.length - 1;
        while (leftBoundary <= rightBoundary) {
            int middleIndex = (leftBoundary + rightBoundary) / 2;
            if (input[middleIndex] < searchElem) {
                leftBoundary = middleIndex + 1;
            } else if (input[middleIndex] > searchElem) {
                rightBoundary = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}
