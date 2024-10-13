package com.mohsen.Longest_Substring_Without_Repeating_Characters;

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
        int result = solution.lengthOfLongestSubstring("abcabcbb");

        assertEquals(3, result);
    }

    @Test
    public void secondSampleTest() {
        int result = solution.lengthOfLongestSubstring("bbbbb");

        assertEquals(1, result);
    }

    @Test
    public void thirdSampleTest() {
        int result = solution.lengthOfLongestSubstring("pwwkew");

        assertEquals(3, result);
    }
}
