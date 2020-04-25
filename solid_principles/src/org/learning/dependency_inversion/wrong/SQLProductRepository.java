package org.learning.dependency_inversion.wrong;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository {
    public List<String> getAllProducts() {
        return Arrays.asList("Apples", "Bananas");
    }
}
