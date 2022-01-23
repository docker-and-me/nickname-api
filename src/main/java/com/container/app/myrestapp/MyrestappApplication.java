package com.container.app.myrestapp;

import com.container.app.controller.FirstController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = FirstController.class)
public class MyrestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyrestappApplication.class, args);
	}

}
