package org.learning.liskov.vehicle.wrong;

public class RaceCar extends Car {
    private double cockpitWidth = 10;

    @Override
    public double getCabinWidth() {
        return 0;
    }

    public double getCockpitWidth() {
        System.out.println("Width is " + cockpitWidth);
        return cockpitWidth;
    }
}
