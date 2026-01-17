package com.twosix.shopapp;


import com.twosix.shopapp.model.Car;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    List<Car> newCar = Arrays.asList(
            new Car(1,"Toyota","Red", "4wd", "turbo max", "4 seater", "sport", 4, 6.68),
            new Car(2,"Honda", "Blue", "Awd", "turbo plus", "4 s" , "hiking", 4, 10.5)
    );

    public List<Car> getProduct(){
        return newCar;
    }

    public Car getProductById(int prodId) {
        return  newCar.stream()
                .filter (p -> p.getId() == prodId)
                .findFirst().orElse(new Car(0, null,null, null,null,null,null,0,0));
    }
}