package com.company;

public class Hamburger {

    private String burgerName;
    private String breadRoll;
    private String meat;
    private double basicPrice;

    private String topping1;
    private double topping1Price;

    private String topping2;
    private double topping2Price;

    private String topping3;
    private double topping3Price;

    private String topping4;
    private double topping4Price;


    public Hamburger(String breadRoll, String meat, double basicPrice) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basicPrice = basicPrice;

    }

    public void addTopping1(String topping1, double topping1Price) {
        this.topping1 = topping1;
        this.topping1Price = topping1Price;
    }

    public void addTopping2(String topping2, double topping2Price) {
        this.topping2 = topping2;
        this.topping2Price = topping2Price;
    }

    public void addTopping3(String topping3, double topping3Price) {
        this.topping3 = topping3;
        this.topping3Price = topping3Price;
    }

    public void addTopping4(String topping4, double topping4Price) {
        this.topping4 = topping4;
        this.topping4Price = topping4Price;
    }

    public double completeBurger() {
        double fullPrice = this.basicPrice;
        if (topping1 != null) {
            fullPrice += this.topping1Price;
        }
        if (topping2 != null) {
            fullPrice += this.topping2Price;
        }
        if (topping3 != null) {
            fullPrice += this.topping3Price;
        }
        if (topping4 != null) {
            fullPrice += this.topping4Price;
        }
        System.out.print("$");
        return fullPrice;
    }

        public void setBurgerName (String burgerName) {
            this.burgerName = burgerName;
            System.out.println(burgerName);
        }

    public double getBasicPrice() {
        return basicPrice;
    }
}



// The basic hamburger should have the following items.

/// bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
/// the customer can select to be added to the burger.

// Each one of these items gets charged an additional
// price so you need some way to track how many items got added and to calculate the final price (base
// burger with all the additions).

/// This burger has a base price and the additions are all seperately priced (up to 4 additions, see above).
/// Create a Hamburger class to deal with all the above.

// The constructor should only include the roll type, meat and price, can also include name of burger or you can use setter.