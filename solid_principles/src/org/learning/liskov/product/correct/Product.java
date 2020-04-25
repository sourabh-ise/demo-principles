package org.learning.liskov.product.correct;

public class Product {
    protected int discount = 20;

    public int getDiscount() {
        System.out.println("Discount is " + discount);
        return discount;
    }
}
