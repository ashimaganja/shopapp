package com.twosix.shopapp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
