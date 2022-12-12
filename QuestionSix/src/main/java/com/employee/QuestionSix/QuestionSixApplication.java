package com.employee.QuestionSix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class QuestionSixApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionSixApplication.class, args);
	}

}
