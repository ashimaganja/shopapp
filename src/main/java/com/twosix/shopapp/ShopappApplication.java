package com.twosix.shopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ShopappApplication {

	public static void main(String[] args) {

       ApplicationContext context= SpringApplication.run(ShopappApplication.class, args);

        //get the type of the container i.e. ApplicationContext

        Emperor emperor = context.getBean(Emperor.class);

        emperor.build();
	}

}
