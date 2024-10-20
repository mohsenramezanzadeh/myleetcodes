package com.mohsen.solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void init() {
        twoSum = new TwoSum();
    }

    @Test
    public void firstSampleTest() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(numbers, target);

        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void secondSampleTest() {
        int[] numbers = {3, 2, 4};
        int target = 6;
        int[] result = twoSum.twoSum(numbers, target);

        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void thirdSampleTest() {
        int[] numbers = {3, 3};
        int target = 6;
        int[] result = twoSum.twoSum(numbers, target);

        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
