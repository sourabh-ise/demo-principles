package org.learning.dependency_inversion.correct_injection;

public class InjectionDemo {
    public static void main(String[] args) {
        ProductRepository repository = ProductFactory.create();
        ProductCatalog catalog = new ProductCatalog(repository);
        catalog.listAllProducts();
    }
}
