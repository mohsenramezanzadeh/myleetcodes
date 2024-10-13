package com.mohsen.twosum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void firstSampleTest() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(numbers, target);

        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void secondSampleTest() {
        int[] numbers = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSum(numbers, target);

        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void thirdSampleTest() {
        int[] numbers = {3, 3};
        int target = 6;
        int[] result = solution.twoSum(numbers, target);

        assertNotNull(result);
        assertEquals(2, result.length);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}
