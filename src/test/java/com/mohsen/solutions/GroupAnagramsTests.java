package com.mohsen.solutions;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class GroupAnagramsTests {
    private GroupAnagrams groupAnagrams;

    @Before
    public void init() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void firstSampleTest() {
        String[] inputs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> actual = groupAnagrams.groupAnagrams(inputs);

        List<List<String>> expected = List.of(List.of("eat", "tea", "ate"), List.of("bat"), List.of("tan", "nat"));
        assertEquals(expected, actual);
    }

    @Test
    public void secondSampleTest() {
        String[] inputs = new String[]{" "};
        List<List<String>> actual = groupAnagrams.groupAnagrams(inputs);

        List<List<String>> expected = List.of(List.of(" "));
        assertEquals(expected, actual);
    }

    @Test
    public void thirdSampleTest() {
        String[] inputs = new String[]{"a"};
        List<List<String>> actual = groupAnagrams.groupAnagrams(inputs);
        List<List<String>> expected = List.of(List.of("a"));
        assertEquals(expected, actual);
    }

}
