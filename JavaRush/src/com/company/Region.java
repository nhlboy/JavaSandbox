package com.company;

public class Region {

    public static double Worker(Double salary, boolean South) {
        if (!South) {
            if (salary >= 0 && salary < 20000) {
                return salary * 0.10;
            }
            if (salary >= 20000 && salary < 40000) {
                return salary * 0.15;
            }
            if (salary >= 40000 && salary < 60000) {
                return salary * 0.25;
            }
            if (salary >= 60000 && salary < 80000) {
                return salary * 0.35;
            }
            if (salary >= 80000 && salary < 100000) {
                return salary * 0.50;
            }
            if (salary >= 100000) {
                return salary * 0.60;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(Worker(65760.00, false));

    }
}
