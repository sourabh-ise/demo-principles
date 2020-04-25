package org.learning.interface_segeration;

public class AllInOne implements Print,Scan,Fax {
    @Override
    public void fax() {
        System.out.println("Fax initiated from All in one");
    }

    @Override
    public void print() {
        System.out.println("Print initiated from All in one");
    }

    @Override
    public void scan() {
        System.out.println("Scan initiated from All in one");
    }
}
