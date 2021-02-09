package com.kavya.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "${basePackages}")
@SpringBootApplication(scanBasePackages = "${scanPackages}")
@EnableJpaRepositories("com.kavya.repository")
public class SpringConfiguration{
	
	public static void main(String[] args) { 
		SpringApplication.run(SpringConfiguration.class, args);
	}
	
}
