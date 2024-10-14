package com.mohsen.pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(List.of(1));
        if (numRows == 1) {
            return result;
        }

        result.add(List.of(1, 1));
        if (numRows == 2) {
            return result;
        }

        List<Integer> previousRow;
        for (int i = 2; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            previousRow = result.get(i - 1);
            for (int j = 0; j < previousRow.size() - 1; j++) {
                newRow.add(previousRow.get(j) + previousRow.get(j + 1));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }
}
