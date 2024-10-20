package com.mohsen.solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {
    private AddBinary addBinary;

    @Before
    public void init() {
        addBinary = new AddBinary();
    }

    @Test
    public void firstSampleTest() {
        String actual = addBinary.addBinary("11", "1");

        assertEquals("100", actual);
    }

    @Test
    public void secondSampleTest() {
        String actual = addBinary.addBinary("1010", "1011");

        assertEquals("10101", actual);
    }
}
