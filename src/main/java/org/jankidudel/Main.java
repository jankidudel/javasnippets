package org.jankidudel;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Integer[] toSort = {10, 41, 7, 3, 99};
        Integer[] response = (new BubbleSort()).sort(toSort);
        System.out.println(Arrays.toString(response));
    }
}