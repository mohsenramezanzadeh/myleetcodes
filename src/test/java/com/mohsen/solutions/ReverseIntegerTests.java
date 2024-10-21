package com.mohsen.solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTests {
    private ReverseInteger reverseInteger;

    @Before
    public void init() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void firstSampleTest() {
        int actual = reverseInteger.reverse(123);
        assertEquals(321, actual);
    }

    @Test
    public void secondSampleTest() {
        int actual = reverseInteger.reverse(-321);
        assertEquals(-123, actual);
    }

    @Test
    public void thirdSampleTest() {
        int actual = reverseInteger.reverse(120);
        assertEquals(21, actual);
    }
}
