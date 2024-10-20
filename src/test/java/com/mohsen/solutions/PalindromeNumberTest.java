package com.mohsen.solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @Before
    public void init() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void firstSampleTest() {
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    public void secondSampleTest() {
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    public void thirdSampleTest() {
        assertFalse(palindromeNumber.isPalindrome(10));
    }
}
