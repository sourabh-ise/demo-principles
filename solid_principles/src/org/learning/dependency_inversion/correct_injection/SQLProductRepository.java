package org.learning.dependency_inversion.correct_injection;

import java.util.Arrays;
import java.util.List;

public class SQLProductRepository implements ProductRepository {
    @Override
    public List<String> getAllProducts() {
        List<String> strings = Arrays.asList("Apples", "Bananas");
        strings.forEach(System.out::println);
        return strings;
    }
}
