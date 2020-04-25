package org.learning.liskov.product.wrong;

public class InhouseProduct extends Product {

    public void applyExtraDiscount() {
        discount = discount * 1.5;
    }
}
