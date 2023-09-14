package com.driver;
public class Pizza {
    private static final int VEG_BASE_PRICE = 300;
    private static final int NON_VEG_BASE_PRICE = 400;
    private static final int EXTRA_CHEESE_PRICE = 80;
    private static final int VEG_EXTRA_TOPPINGS_PRICE = 70;
    private static final int NON_VEG_EXTRA_TOPPINGS_PRICE = 120;
    private static final int PAPER_BAG_PRICE = 20;

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? VEG_BASE_PRICE : NON_VEG_BASE_PRICE;
        this.bill = "Base Price Of The Pizza: " + this.price;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            this.price += EXTRA_CHEESE_PRICE;
            this.bill += "\nExtra Cheese Added: " + EXTRA_CHEESE_PRICE;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            String extraToppingsLabel = isVeg ? "Extra Toppings (Veg) Added" : "Extra Toppings (Non-Veg) Added";
            int extraToppingsPrice = isVeg ? VEG_EXTRA_TOPPINGS_PRICE : NON_VEG_EXTRA_TOPPINGS_PRICE;
            this.price += extraToppingsPrice;
            this.bill += "\n" + extraToppingsLabel + ": " + extraToppingsPrice;
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!this.bill.contains("Paperbag Added")) {
            this.price += PAPER_BAG_PRICE;
            this.bill += "\nPaperbag Added: " + PAPER_BAG_PRICE;
        }
    }

    public String getBill() {
        return this.bill + "\nTotal Price: " + this.price;
    }
}
