package org.learning.dependency_inversion.correct_injection;

public class ProductFactory {
    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
