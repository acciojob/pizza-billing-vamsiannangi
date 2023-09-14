package com.driver.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.driver.DeluxePizza;
import com.driver.Pizza;

public class TestCases {
    @Test
    public void testRegularPizzaWithExtraCheeseAndExtraToppings() {
        Pizza pizza = new Pizza(true);
        pizza.addExtraCheese();
        pizza.addExtraToppings();
        pizza.addTakeaway();
        String expected = "Base Price Of The Pizza: 300\nExtra Cheese Added: 80\nExtra Toppings (Veg) Added: 70\nPaperbag Added: 20\nTotal Price: 470";
        Assert.assertEquals(expected, pizza.getBill());
    }

    @Test
    public void testRegularPizzaWithExtraCheese() {
        Pizza pizza = new Pizza(true);
        pizza.addExtraCheese();
        pizza.addTakeaway();
        String expected = "Base Price Of The Pizza: 300\nExtra Cheese Added: 80\nPaperbag Added: 20\nTotal Price: 400";
        Assert.assertEquals(expected, pizza.getBill());
    }

    @Test
    public void testDeluxePizza() {
        Pizza pizza = new DeluxePizza(true);
        pizza.addTakeaway();
        String expected = "Base Price Of The Pizza: 300\nExtra Cheese Added: 80\nExtra Toppings (Veg) Added: 70\nPaperbag Added: 20\nTotal Price: 470";
        Assert.assertEquals(expected, pizza.getBill());
    }
}
