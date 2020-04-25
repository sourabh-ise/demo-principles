package org.learning.interface_segeration;

public class Scanner implements Scan {
    @Override
    public void scan() {
        System.out.println("Scan initiated");
    }
}
