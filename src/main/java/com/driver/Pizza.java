package com.driver;

public class Pizza {
    private int price;
    private int basePrice; //price without extra additions
    private Boolean isExtraCheese = false;
    private Boolean isToppings = false;
    private Boolean isTakeAway = false;
    int takeAwayPrice = 20;
    int extraCheesePrice = 80;
    int extraToppingsPrice = 70;

    public Pizza(Boolean isVeg){
        //true for a vegetable pizza
        if(isVeg){
            this.price = 300;
        }else{
            this.price = 400;
        }
        basePrice = price;
    }

    public int getBasePrice(){
        return this.basePrice;
    }//for future use

    public void addExtraCheese(){
        if(!isExtraCheese) {
            System.out.println("+ Added extra cheese!: " + extraCheesePrice);
            this.price += extraCheesePrice;
        }else{
            System.out.println("!* Extra cheese already added!");
        }
        isExtraCheese = true;
    }

    public void addExtraToppings(){
        if(!isToppings) {
            System.out.println("+ Added extra toppings!: " + extraToppingsPrice);
            this.price += extraToppingsPrice;
        }else {
            System.out.println("*! Extra toppings already added!");
        }
        isToppings = true;
    }

    public void takeAway(){
        if(!isTakeAway) {
            System.out.println("+ Takeaway order for: " + takeAwayPrice);
            this.price += takeAwayPrice;
        }else{
            System.out.println("*! Takeaway already selected!");
        }
        isTakeAway = true;
    }

    public void getBill(){
        System.out.println();
        System.out.println("-------------Bill-----------------");
        System.out.println("Base pizza: " + basePrice);
        if(isExtraCheese){
            System.out.println("Extra cheese: " + extraCheesePrice);
        }
        if(isToppings){
            System.out.println("Extra toppings: " + extraToppingsPrice );
        }
        if(isTakeAway){
            System.out.println("Takeaway services: " + takeAwayPrice );
        }
        System.out.println("--------------TOTAL---------------");
        System.out.println(this.price);
        System.out.println("----------------------------------");
        System.out.println();
    }
}