package com.mohsen.solutions;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder asb = new StringBuilder(a);
        StringBuilder bsb = new StringBuilder(b);
        int length;

        if (asb.length() > b.length()) {
            length = asb.length();
            while (bsb.length() != asb.length()) {
                bsb.insert(0, '0');
            }
        } else {
            length = bsb.length();
            while (bsb.length() != asb.length()) {
                asb.insert(0, '0');
            }
        }

        boolean carry = false;
        StringBuilder result = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            Character ac = asb.charAt(i);
            Character bc = bsb.charAt(i);

            if (!ac.equals(bc)) {
                if (carry) {
                    result.insert(0, 0);
                    carry = true;
                } else {
                    result.insert(0, 1);
                    carry = false;
                }
            } else {
                if (ac.equals('1')) {
                    if (carry) {
                        result.insert(0, 1);
                        carry = true;
                    } else {
                        result.insert(0, 0);
                        carry = true;
                    }
                } else {
                    if (carry) {
                        result.insert(0, 1);
                        carry = false;
                    } else {
                        result.insert(0, 0);
                        carry = false;
                    }
                }
            }

        }
        if (carry) {
            result.insert(0, '1');
        }
        return result.toString();
    }
}