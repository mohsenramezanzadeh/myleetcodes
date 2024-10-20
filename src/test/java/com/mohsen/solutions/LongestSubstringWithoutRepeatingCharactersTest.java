package com.mohsen.solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    private LongestSubstringWithoutRepeatingCharacters solution;

    @Before
    public void init() {
        solution = new LongestSubstringWithoutRepeatingCharacters();
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
