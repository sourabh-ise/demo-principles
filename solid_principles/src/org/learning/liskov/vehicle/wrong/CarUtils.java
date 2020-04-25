package org.learning.liskov.vehicle.wrong;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new RaceCar();

        List<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.forEach(Car::getCabinWidth);

    }
}
