package org.learning.liskov.vehicle.correct;

import java.util.ArrayList;
import java.util.List;

public class VehicleUtils {
    public static void main(String[] args) {
        Vehicle c1 = new Car();
        Vehicle c2 = new Car();
        Vehicle c3 = new RaceCar();

        List<Vehicle> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.forEach(Vehicle::getInteriorWidth);

    }
}
