package com.sda.dealership.storage;

import com.sda.dealership.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarDAO extends GenericDAO<Car> {
    private static List<Car> cars = new ArrayList<Car>();

    @Override
    protected List<Car> getItems() {
        return cars;
    }
}
