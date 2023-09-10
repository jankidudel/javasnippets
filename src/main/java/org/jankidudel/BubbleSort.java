package org.jankidudel;

class BubbleSort {

    public Integer[] sort(Integer[] input) {
        var swapped = false;
        do {
            swapped = false;
            for (int i = 1; i < input.length; i++) {
                var swapNeeded = input[i-1] > input[i];
                if (swapNeeded) {
                    int swapVal = input[i-1];
                    input[i-1] = input[i];
                    input[i] = swapVal;
                    swapped = true;
                }
//                System.out.println("Swap needed for " + input[i-1] + " and " + input[i] + " = " + Boolean.toString(swapNeeded));
            }
        } while (swapped);
        return input;
    }
}

//(new BubbleSort()).run();