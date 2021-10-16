package com.consolecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { ErrorMvcAutoConfiguration.class })
@ComponentScan(basePackages = {"com.consolecode"})
@EntityScan("com.consolecode.model")
@EnableJpaRepositories("com.consolecode.repository")

public class ProyectoConsolecodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoConsolecodeApplication.class, args);
	}

}
