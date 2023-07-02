package org.example;

public class Solution {

    /**
     * Finds the smallest even multiple of the given number.
     *
     * @param n The number to find the smallest even multiple for.
     * @return The smallest even multiple of the given number.
     */
    public int smallestEvenMultiple(int n) {
        if (n % 2 == 0) return n;
        return n * 2;
    }
}
