package org.learning.liskov.product.wrong;

public class Product {
    protected double discount = 20;

    public double getDiscount() {
        System.out.println("Discount is " + discount);
        return discount;
    }
}
