package com.mohsen.Longest_Substring_Without_Repeating_Characters;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (s.isBlank()) {
            return 1;
        }
        if (s.length() == 1) {
            return 1;
        }
        StringBuilder sub = new StringBuilder("");
        int longestSubLength = 0;
        int lastSubLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String charValue = String.valueOf(c);
            int charIndex = sub.indexOf(charValue);
            if (charIndex == -1 ) {
                sub.append(c);
                lastSubLength = sub.length();
            } else {
                if (sub.length() > longestSubLength) {
                    longestSubLength = sub.length();
                }
                sub.replace(0, charIndex + 1, "");
                sub.append(c);
            }
        }
        if (longestSubLength < lastSubLength) {
            longestSubLength = lastSubLength;
        }
        return longestSubLength;
    }
}
