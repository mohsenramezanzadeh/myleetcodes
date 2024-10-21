package com.mohsen.solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigzagConversionTests {
    private ZigzagConversion zigzagConversion;

    @Before
    public void init() {
        zigzagConversion = new ZigzagConversion();
    }

    @Test
    public void firstSampleTest() {
        String statement = "PAYPALISHIRING";
        int rowNum = 3;

        String actual = zigzagConversion.convert(statement, rowNum);

        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, actual);
    }

    @Test
    public void secondSampleTest() {
        String statement = "PAYPALISHIRING";
        int rowNum = 4;

        String actual = zigzagConversion.convert(statement, rowNum);

        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, actual);
    }

    @Test
    public void thirdSampleTest() {
        String statement = "A";
        int rowNum = 1;

        String actual = zigzagConversion.convert(statement, rowNum);

        String expected = "A";
        assertEquals(expected, actual);
    }
}
