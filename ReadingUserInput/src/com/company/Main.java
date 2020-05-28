package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner popizdim = new Scanner(System.in);
        System.out.println("What is your fucking name: ");
        String name = popizdim.nextLine();
        System.out.println("Your fucking name is " + name);
        System.out.println("What s your fucking number ");
        String phone = popizdim.nextLine();
        System.out.println("Your fucking number is: " + phone);
        System.out.println("You are " + name + " and your fucking number is " + phone);
        System.out.println("Ne pizdish???");


        popizdim.close();
    }
}
