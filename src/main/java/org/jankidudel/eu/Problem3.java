package org.jankidudel.eu;

public class Problem3 {
    private long lookupNumber = 600851475143L; // Result = 6857


    public Problem3() {
    }

    public Problem3(long lookupNumber) {
        this.lookupNumber = lookupNumber;
    }

    public static void main(String[] args) {
        Problem3  problem3 = new Problem3();
        int result = problem3.run();
        System.out.println("Result = " + result);
    }

    private int getNextPrimeNumber(int currentPrime) {
        int incr = 1;
        for (;;) {
            int tmpVal = currentPrime + incr;
            int squareRoot = (int)Math.sqrt(tmpVal);
            boolean isPrime = true;
            for (int j = 2; j <= squareRoot; j++) {
                if (tmpVal % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                return tmpVal;
            }
            incr++;
        }
    }

    public int run() {
        long remainder = this.lookupNumber;
        int currentPrime = 1;
        int largestPrime = currentPrime;
        do {
            currentPrime = this.getNextPrimeNumber(currentPrime);
            if (remainder % currentPrime == 0) {
                largestPrime = currentPrime;
                remainder = remainder / largestPrime;
                if (remainder / currentPrime == 0) {
                    break;
                }
            }
        } while (remainder > 0);
        return largestPrime;
    }
}
