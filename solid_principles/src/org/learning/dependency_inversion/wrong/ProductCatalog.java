package org.learning.dependency_inversion.wrong;

public class ProductCatalog {
    public void listAllProducts(){
        SQLProductRepository repository = new SQLProductRepository();
        repository.getAllProducts();
    }
}
