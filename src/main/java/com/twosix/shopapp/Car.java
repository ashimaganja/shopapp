package com.twosix.shopapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

        private String name;
        private String color;
        private String engineType;
        private String engineName;
        private String seats;
        private String modes;
        private int wheels;
        private double tank;

}
