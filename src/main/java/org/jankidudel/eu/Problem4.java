package org.jankidudel.eu;

public class Problem4 {
    private int noOfDigits = 3;

    public Problem4() {

    }

    public Problem4(int noOfDigits) {
        this.noOfDigits = noOfDigits;
    }

    public static void main(String[] args) {
        Problem4 problem4 = new Problem4();
        int result = problem4.run();
        System.out.println("Result = " + result);
    }

    public int run() {
        int maxNum = Integer.parseInt("9".repeat(this.noOfDigits));
        int minNum = maxNum / 10;
        int maxPolyndrome = 0;
        for (int i = maxNum; i > minNum; i--) {
            if (i * maxNum < maxPolyndrome) {
                break; // save some iterations
            }
            for (int j = maxNum; j > minNum; j--) {
                int multiplication = i * j;
                if (multiplication <= maxPolyndrome) {
                    break; // no point of extra iterations
                }
                if (this.isPalindrome(multiplication)) {
                    maxPolyndrome = multiplication;
                    break;
                }
            }
        }
        return maxPolyndrome;
    }

    private boolean isPalindrome(int originalNumber) {
        int reverseNumber = 0;
        int originalNumberCopy = originalNumber;
        while(originalNumberCopy != 0) {
            int digit = originalNumberCopy % 10;
            reverseNumber = reverseNumber * 10 + digit;
            originalNumberCopy /= 10;
        }
        return originalNumber == reverseNumber;
    }
}
