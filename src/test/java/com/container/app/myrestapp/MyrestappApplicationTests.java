package com.container.app.myrestapp;

import com.container.app.myrestapp.controller.FirstController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MyrestappApplicationTests {

	@Autowired
	FirstController firstController;

	@Test
	void contextLoads() {
		assertThat(firstController).isNotNull();
	}

}
