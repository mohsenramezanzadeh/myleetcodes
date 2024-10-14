package com.mohsen.add_binary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void firstSampleTest() {
        String actual = solution.addBinary("11", "1");

        assertEquals("100", actual);
    }

    @Test
    public void secondSampleTest() {
        String actual = solution.addBinary("1010", "1011");

        assertEquals("10101", actual);
    }
}
