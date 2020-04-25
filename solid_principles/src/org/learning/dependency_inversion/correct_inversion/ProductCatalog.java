package org.learning.dependency_inversion.correct_inversion;

public class ProductCatalog {
    public void listAllProducts() {
        ProductRepository repository = ProductFactory.create();
        repository.getAllProducts();
    }
}
