package csd226.lab3;

import csd226.lab3.data.AccessToken;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lecture8Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = SpringApplication.run(Lecture8Application.class, args);
	}
	@Bean
	public AccessToken getAccessToken(){return new AccessToken();};

}
