package com.twosix.shopapp.controller;



import com.twosix.shopapp.model.Car;
import com.twosix.shopapp.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EverythingController {

    @Autowired
    CarService carService;

    @GetMapping("home")
    public String home(){
        return "This is home";
    }

    @RequestMapping("/products")
    public List<Car> getCars(){
        return carService.getProduct();
    }

    @RequestMapping("/products/{prodId}")
    public Car getProductById(@PathVariable int prodId){
        return carService.getProductById(prodId);
    }


}
