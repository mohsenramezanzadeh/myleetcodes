package com.mohsen.solutions;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int reversed = 0;
        int num = x;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        return num == reversed;
    }

    public boolean isPalindrome1(int x) {
        String value = String.valueOf(x);
        int digitsCount = value.length();
        for (int i = 0; i < digitsCount; i++) {
            if (i < digitsCount / 2) {
                if (value.charAt(i) != value.charAt(digitsCount - i - 1)) {
                    return false;
                }
            } else {
                return true;
            }
        }
        return true;
    }
}
