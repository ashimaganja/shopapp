package com.twosix.shopapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

        private int Id;
        private String name;
        private String color;
        private String engineType;
        private String engineName;
        private String seats;
        private String modes;
        private int wheels;
        private double tank;

}
