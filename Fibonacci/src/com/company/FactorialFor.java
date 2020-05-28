package com.company;

public class FactorialFor {
    private int fact(int n) {
        if (n < 0) {
            return 0;
        }
        int result = 1;
        if (n == 0) {
            return result;
        }
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
