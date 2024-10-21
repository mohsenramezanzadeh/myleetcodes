package com.mohsen.solutions;

public class ReverseInteger {
    public int reverse(int x) {
        if (x / 10 == 0) {
            return x;
        }
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder();
        int limit = x >= 0 ? 0 : 1;
        for (int i = s.length() - 1; i >= limit; i--) {
            sb.append(s.charAt(i));
        }
        long result = x < 0 ? -1 * Long.parseLong(sb.toString()) : Long.parseLong(sb.toString());
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) result;
    }
}
