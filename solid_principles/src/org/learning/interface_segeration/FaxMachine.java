package org.learning.interface_segeration;

public class FaxMachine implements Fax {
    @Override
    public void fax() {
        System.out.println("Fax initiated");
    }
}
