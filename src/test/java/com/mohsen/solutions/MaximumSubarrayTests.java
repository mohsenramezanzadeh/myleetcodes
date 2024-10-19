package com.mohsen.solutions;

import com.mohsen.maximumsubarray.MaximumSubarray;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaximumSubarrayTests {

    private MaximumSubarray maximumSubarray;

    @Before
    public void init() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void firstSampleTest() {
        int[] inputs = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int actual = maximumSubarray.maxSubArray(inputs);

        assertEquals(6, actual);
    }

    @Test
    public void secondSampleTest() {
        int[] inputs = new int[]{5,4,-1,7,8};
        int actual = maximumSubarray.maxSubArray(inputs);

        assertEquals(23, actual);
    }

    @Test
    public void thirdSampleTest() {
        int[] inputs = new int[]{1};
        int actual = maximumSubarray.maxSubArray(inputs);

        assertEquals(1, actual);
    }
}
