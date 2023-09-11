package org.jankidudel.eu;

public class Problem2 {

    private int maxTerm = 4000000; // 4 million

    public Problem2() {
    }

    public Problem2(int maxTerm) {
        this.maxTerm = maxTerm;
    }

    public static void main(String[] args) {
        Problem2 problem1 = new Problem2();
        int result = problem1.run();
        System.out.println("Result = " + result);
    }

    public int run() {
        int prevTerm = 0;
        int lastTerm = 1;
        int sum = 0;
        while (lastTerm <= this.maxTerm) {
            int tmpSwap = prevTerm;
            prevTerm = lastTerm;
            lastTerm += tmpSwap;

            if (lastTerm > this.maxTerm) {
                break;
            }
            if (lastTerm % 2 == 0) {
                sum += lastTerm;
            }
        }
        return sum;
    }
}
