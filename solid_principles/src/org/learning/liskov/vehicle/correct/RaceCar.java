package org.learning.liskov.vehicle.correct;

public class RaceCar implements Vehicle {
    private double cockpitWidth = 10;

    public double getCockpitWidth() {
        System.out.println("Width of race car is " + cockpitWidth);
        return cockpitWidth;
    }

    @Override
    public double getInteriorWidth() {
        return getCockpitWidth();
    }
}
