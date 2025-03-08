package com.github.timebetov;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DocklearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocklearnApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(DemoRepository repository) {
		return args -> {
			repository.save(new DemoEntity("Docker", "Docker containerization"));
		};
	}

}
