package org.learning.liskov.vehicle.correct;

public class Car implements Vehicle {

    private double cabinWidth = 400;

    @Override
    public double getInteriorWidth() {
        return getCabinWidth();
    }

    public double getCabinWidth() {
        System.out.println("Width of car is " + cabinWidth);
        return cabinWidth;
    }
}
