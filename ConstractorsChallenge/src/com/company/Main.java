package com.company;

public class Main {

    public static void main(String[] args) {
//    Account kirillsAccount = new Account();
//    Account tanyasAccount = new BankAccount(123456, 10000, "Tanya Brui", "tanya.brui@gmail.com", "123456789");
//    kirillsAccount.getBalance();
//
//    kirillsAccount.setBalance(1000000);
//    kirillsAccount.getBalance();
//    kirillsAccount.withdrawal(999999);

        VipCustomer kirkVip = new VipCustomer();

        System.out.println(kirkVip.getName());
        System.out.println(kirkVip.getCreditLimit());
        System.out.println(kirkVip.getEmail());

        System.out.println("_________");

        VipCustomer kirkVip2 = new VipCustomer("Kirk", 2000000);
        System.out.println(kirkVip2.getName());
        System.out.println(kirkVip2.getCreditLimit());
        System.out.println(kirkVip2.getEmail());

        System.out.println("_________");

        VipCustomer kirkVip3 = new VipCustomer("Mr Kirk", 5000000, "MeKirk@VipEmail.com");
        System.out.println(kirkVip3.getName());
        System.out.println(kirkVip3.getCreditLimit());
        System.out.println(kirkVip3.getEmail());
    }


}

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field


// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).


// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.