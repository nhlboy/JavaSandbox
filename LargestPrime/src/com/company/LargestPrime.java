package com.company;

public class LargestPrime {

        public static int getLargestPrime(int number) {
            if (number < 2) {
                return -1;
            }
            // i represents prime numbers starting from 2
            for (int i = 2; i < number / 2; i++) {
                // Keep dividing the number by the prime as long as it has no remainder
                // If the number is divisible by itself exit the while loop
                while ((number % i == 0) && (number / i != 1)) {
                    number /= i;
                }
            }
            return number;
        }
    }

