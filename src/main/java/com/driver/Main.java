package com.driver;


public class Main {
  public static void main(String[] args) {
    Pizza p = new Pizza(false);
    DeluxPizza p2 = new DeluxPizza(true);

    p.getBill();

    p.addExtraCheese();
    p.addExtraToppings();
    p.addExtraCheese();
    p.takeAway();
    p.getBill();

    p2.getBill();
  }
}
