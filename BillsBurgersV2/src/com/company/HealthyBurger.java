package com.company;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(String breadRoll, String meat, double basicPrice) {
        super("Wheat", "Pork", 4.99);
    }

    private String topping5;
    private double topping5Price;

    private String topping6;
    private double topping6Price;

    public void addTopping5(String topping5, double topping5Price) {
        this.topping5 = topping5;
        this.topping5Price = topping5Price;
    }

    public void addTopping6(String topping6, double topping6Price) {
        this.topping6 = topping6;
        this.topping6Price = topping6Price;
    }

    @Override
    public double completeBurger() {
        double fullPrice = super.completeBurger();
        if (topping5 != null) {
            fullPrice += this.topping5Price;
        }
        if (topping6 != null) {
            fullPrice += this.topping6Price;
        }
        System.out.print("$");
        return fullPrice;
    }
}

// a) Healthy burger (on a brown rye bread roll), plus two addition items can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the 2 additional items in this new class (subclass of Hamburger), not the base class (Hamburger),
// since the 2 additions are only appropriate for this new class (in other words new burger type).