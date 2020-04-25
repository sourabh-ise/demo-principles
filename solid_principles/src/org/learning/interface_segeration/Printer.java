package org.learning.interface_segeration;

public class Printer implements Print {
    @Override
    public void print() {
        System.out.println("Print initiated");
    }
}
