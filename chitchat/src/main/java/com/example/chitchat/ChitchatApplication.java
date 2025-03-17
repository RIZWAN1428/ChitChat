package com.example.chitchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.chitchat.model")
@EnableJpaRepositories("com.example.chitchat.repository")
public class ChitchatApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChitchatApplication.class, args);
	}
}