package com.tpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories
@EnableSwagger2
public class TpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpointApplication.class, args);
	}

}
