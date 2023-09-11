package org.jankidudel.eu;

public class Problem1 {

    private int belowNumber = 1000;

    public Problem1() {
    }

    public Problem1(int belowNumber) {
        this.belowNumber = belowNumber;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        int result = problem1.run();
        System.out.println("Result = " + result);
    }

    public int run() {
        int sum = 0;
        for (int i = 1; i < this.belowNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
