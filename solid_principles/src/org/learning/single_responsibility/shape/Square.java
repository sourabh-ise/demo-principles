package org.learning.single_responsibility.shape;

public class Square {
    int side = 5;

    public int calculateArea() {
        return side ^ 2;
    }

    public int calculatePeremeter() {
        return side * 4;
    }
}
