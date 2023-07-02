package os;

import os.enums.Gender;
import os.logic.Customer;
import os.logic.Order;
import os.logic.Product;

import java.util.LinkedList;
import java.util.List;


public class Main {


    public static void main(String[] args) {
        // Create some customers and products
        Customer[] customers = {
                new Customer("John", 30, "+1 (123) 456-7890", Gender.MALE),
                new Customer("Jane", 25, "+1 (234) 567-8901", Gender.FEMALE)
        };

        Product[] products = {
                new Product("Widget", 100),
                new Product("Gadget", 200),
                new Product("Thingamajig", 300),
                new Product("Doohickey", 400),
                new Product("Whatsit", 500)
        };

        List<Order> orders = new LinkedList<>();

        // Make some purchases
        try {
            orders.add(Order.makePurchase("John", "Widget", 3, customers, products));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            orders.add(Order.makePurchase("Jin", "Whatsit", 2, customers, products));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            orders.add(Order.makePurchase("Jane", "Doohickey ", 7, customers, products));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            orders.add(Order.makePurchase("Jane", "Whatsit", -1, customers, products));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            orders.add(Order.makePurchase("Jane ", "Apple", 11, customers, products));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // Print the number of purchases
        int numPurchases = 0;
        for (Order order : orders) {
            if (order != null) {
                numPurchases++;
            }
        }
        System.out.println("Number of purchases: " + numPurchases);
    }
}