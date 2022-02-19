package com.container.app.myrestapp;

import com.container.app.myrestapp.entity.Human;
import com.container.app.myrestapp.repo.HumanRepo;
import com.container.app.myrestapp.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MyrestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyrestappApplication.class, args);
	}

}
