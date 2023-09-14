package com.driver;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter '1' for Regular Pizza or '2' for Deluxe Pizza:");
    int pizzaChoice = scanner.nextInt();
    scanner.nextLine();

    boolean isVeg = true;
    if (pizzaChoice == 2) {
      System.out.println("Enter '1' for Veg or '2' for Non-Veg:");
      int vegChoice = scanner.nextInt();
      scanner.nextLine();
      isVeg = vegChoice == 1;
    } else {
      System.out.println("Enter '1' for Veg or '2' for Non-Veg:");
      int vegChoice = scanner.nextInt();
      scanner.nextLine();
      isVeg = vegChoice == 1;
    }

    Pizza pizza;
    if (pizzaChoice == 2) {
      pizza = new DeluxePizza(true);
    } else {
      pizza = new Pizza(isVeg);
    }

    System.out.println("Pizza ordered. Do you want to customize it? (Y/N):");
    String customizeChoice = scanner.nextLine();
    while (customizeChoice.equalsIgnoreCase("Y")) {
      System.out.println("Enter '1' to add extra cheese, '2' to add extra toppings, '3' for takeaway:");
      int customization = scanner.nextInt();
      scanner.nextLine();

      switch (customization) {
        case 1:
          pizza.addExtraCheese();
          break;
        case 2:
          pizza.addExtraToppings();
          break;
        case 3:
          pizza.addTakeaway();
          break;
        default:
          System.out.println("Invalid choice.");
      }

      System.out.println("Do you want to customize it more? (Y/N):");
      customizeChoice = scanner.nextLine();
    }
    System.out.println("Bill for the pizza:");
    System.out.println(pizza.getBill());
  }
}
