package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from balance field,
        // but not allow the withdrawal to complete if their are unsufficient funds.
        // You will want to create various code in the Main class (the one created by InteliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.


        Account kirkAccount = new Account(); // "12345", 0, "Kirk", "kirk@email.com", "416.671.2147"

        System.out.println(kirkAccount.getNumber());
        System.out.println(kirkAccount.getBalance());

        kirkAccount.withdrawal(100);

        kirkAccount.deposit(50);
        kirkAccount.withdrawal(100);

        kirkAccount.deposit(51);
        kirkAccount.withdrawal(100);

        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getBalance());
        timsAccount.withdrawal(100.55);

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // Create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it recieves and add a default value for the 3rd
        // 3rd constructor should save all fields
        // create getters only for this using code generation of InteliJ as setters wont be needed
        // test and confirm it works


        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Kirill", 25000);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tanya", 1000, "tanya@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
