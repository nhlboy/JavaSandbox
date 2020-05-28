package com.company;

import java.util.concurrent.RecursiveAction;

public class ForkJointFactorial extends RecursiveAction {
    @Override
    protected void compute() {

    }

    private int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }

}
