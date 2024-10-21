package com.mohsen.solutions;

import java.util.HashMap;
import java.util.Map;

public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows > s.length()) {
            return s;
        }
        Map<Integer, StringBuilder> rowsValue = new HashMap<>();
        int lastInsertedIndex = -1;
        boolean isReversed = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!rowsValue.containsKey(i % numRows)) {
                StringBuilder sb = new StringBuilder();
                sb.append(c);
                rowsValue.put(i % numRows, sb);
                lastInsertedIndex = i % numRows;
                if (i % numRows == numRows - 1) {
                    isReversed = true;
                }
                continue;
            }

            int key;
            if (!isReversed) {
                key = lastInsertedIndex + 1;
                StringBuilder sb = rowsValue.get(key);
                sb.append(c);
                if (key == numRows - 1) {
                    isReversed = true;
                }
                lastInsertedIndex = key;
                continue;
            }
            key = lastInsertedIndex - 1;
            StringBuilder sb = rowsValue.get(key);
            sb.append(c);
            lastInsertedIndex = key;
            if (key == 0) {
                isReversed = false;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            sb.append(rowsValue.get(i));
        }
        return sb.toString();
    }
}
