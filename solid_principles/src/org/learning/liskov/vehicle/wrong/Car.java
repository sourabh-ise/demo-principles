package org.learning.liskov.vehicle.wrong;

public class Car {

    private double cabinWidth = 400;

    public double getCabinWidth(){
        System.out.println("Width is " +cabinWidth);
        return cabinWidth;
    }

}
