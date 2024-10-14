package com.mohsen.pascal_triangle;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
    }

    @Test
    public void firstSampleTest() {
        final int numRow = 5;
        List<List<Integer>> actual = solution.generate(numRow);

        assertNotNull(actual);
        assertEquals(numRow, actual.size());

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));
        expected.add(List.of(1,1));
        expected.add(List.of(1,2,1));
        expected.add(List.of(1,3,3,1));
        expected.add(List.of(1,4,6,4,1));

        assertEquals(expected, actual);
    }

    @Test
    public void secondSampleTest() {
        final int numRow = 1;
        List<List<Integer>> actual = solution.generate(numRow);

        assertNotNull(actual);
        assertEquals(numRow, actual.size());

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));

        assertEquals(expected, actual);
    }

    @Test
    public void thirdSampleTest() {
        final int numRow = 2;
        List<List<Integer>> actual = solution.generate(numRow);

        assertNotNull(actual);
        assertEquals(numRow, actual.size());

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1));
        expected.add(List.of(1,1));

        assertEquals(expected, actual);
    }
}
