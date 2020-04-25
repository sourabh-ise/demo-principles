package org.learning.liskov.product.correct;

import java.util.ArrayList;
import java.util.List;

public class RunProduct {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new InhouseProduct();
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.forEach(Product::getDiscount);
    }
}
