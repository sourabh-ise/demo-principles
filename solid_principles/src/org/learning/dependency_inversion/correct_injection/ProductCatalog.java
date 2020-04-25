package org.learning.dependency_inversion.correct_injection;

public class ProductCatalog {
    private ProductRepository repository;

    public ProductCatalog(ProductRepository repository) {
        this.repository = repository;
    }

    public void listAllProducts() {
        repository.getAllProducts();
    }
}
