package org.learning.dependency_inversion.correct_inversion;

public class ProductFactory {
    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
