package os.logic;

import os.enums.DiscountSize;
import os.exeptions.AmountException;
import os.exeptions.CustomerException;
import os.exeptions.ProductException;

import java.util.Random;

public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    private int totalPrice;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void applyRandomDiscount(Product product) {
        DiscountSize[] discountSizes = DiscountSize.values();
        int randomIndex = new Random().nextInt(discountSizes.length);
        DiscountSize randomDiscount = discountSizes[randomIndex];
        product.setDiscount(randomDiscount);
        product.applyDiscount();
    }

    public static Order makePurchase(String customerName, String productName, int quantity, Customer[] customers, Product[] products) throws CustomerException, ProductException, AmountException {
        Customer customer = null;
        Product product = null;

        // Find the customer
        for (Customer c : customers) {
            if (c.getName().equals(customerName)) {
                customer = c;
                break;
            }
        }

        if (customer == null) {
            throw new CustomerException();
        }

        // Find the product
        for (Product p : products) {
            if (p.getName().equals(productName)) {
                product = p;
                break;
            }
        }

        if (product == null) {
            throw new ProductException();
        }

        // Check the quantity
        if (quantity < 1 || quantity > 10) {
            throw new AmountException();
        }

        // Create the order
        Order order = new Order(customer, product, quantity);
        order.applyRandomDiscount(product);
        order.setTotalPrice(product.getPrice() * quantity);

        return order;
    }
}

