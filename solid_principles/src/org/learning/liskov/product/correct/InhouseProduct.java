package org.learning.liskov.product.correct;

public class InhouseProduct extends Product {
    @Override
    public int getDiscount() {
        this.applyExtraDiscount();
        System.out.println("Discount is " + discount);
        return discount;
    }

    public void applyExtraDiscount() {
        discount = discount * 2;
    }
}
