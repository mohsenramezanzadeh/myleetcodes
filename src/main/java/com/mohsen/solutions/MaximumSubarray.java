package com.mohsen.solutions;

public class MaximumSubarray {
    public int maxSubArray(int[] numbers) {
        int tempMax = 0;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            tempMax += number;
            if (tempMax > max) {
                max = tempMax;
            }
            if (tempMax < 0) {
                tempMax = 0;
            }
        }
        return max;
    }
}
