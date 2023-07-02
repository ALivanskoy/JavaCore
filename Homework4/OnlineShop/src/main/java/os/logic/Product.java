package os.logic;

import os.enums.DiscountSize;

public class Product {
    private String name;
    private int price;
    private DiscountSize discount;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.discount = DiscountSize.ZERO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public DiscountSize getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountSize discount) {
        this.discount = discount;
    }

    public void applyDiscount() {
        int discountPercent = discount.getValue();
        int discountedPrice = price - (price * discountPercent / 100);
        setPrice(discountedPrice);
    }
}
