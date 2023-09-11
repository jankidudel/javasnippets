package org.jankidudel.algorithms;

class MergeSort {

    public Integer[] sort(Integer[] input) {

        int inputSize = input.length;

        Integer[] inputCopy = input.clone();
        this.topDownSplitMerge(input, 0, inputSize, inputCopy);

        return input;

    }

    private void topDownSplitMerge(Integer[] inputCopy, int iBegin, int iEnd, Integer[] input) {
        if (iEnd - iBegin <= 1) {
            return;
        }

        int iMiddle = (iEnd + iBegin) / 2;
        topDownSplitMerge(input, iBegin, iMiddle, inputCopy);
        topDownSplitMerge(input, iMiddle, iEnd, inputCopy);
        topDownMerge(inputCopy, iBegin, iMiddle, iEnd, input);
    }

    private void topDownMerge(Integer[] inputCopy, int iBegin, int iMiddle, int iEnd, Integer[] input) {
        int i = iBegin;
        int j = iMiddle;

        for (int k = iBegin; k < iEnd; k++) {
            if (i < iMiddle && (j >= iEnd || input[i] <= input[j])) {
                inputCopy[k] = input[i];
                i++;
            } else {
                inputCopy[k] = input[j];
                j++;
            }
        }
    }
}
