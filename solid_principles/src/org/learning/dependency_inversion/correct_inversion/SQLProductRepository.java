package org.learning.dependency_inversion.correct_inversion;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository implements ProductRepository {
    @Override
    public List<String> getAllProducts() {
        return Arrays.asList("Apples", "Bananas");
    }
}
