package com.mohsen.solutions;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> charactersAnagrams = new HashMap<>();
        for (String element : strs) {
            char[] chars = element.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!charactersAnagrams.containsKey(key)) {
                charactersAnagrams.put(key, new ArrayList<>());
            }
            charactersAnagrams.get(key).add(element);
        }
        return new ArrayList<>(charactersAnagrams.values());
    }
}
