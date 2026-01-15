package com.twosix.shopapp;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    List<Car> newCar = Arrays.asList(
            new Car("Toyota","Red", "4wd", "turbo max", "4 seater", "sport", 4, 6.68),
            new Car("Honda", "Blue", "Awd", "turbo plus", "4 s" , "hiking", 4, 10.5)
    );

    public List<Car> getProduct(){
        return newCar;
    }
}