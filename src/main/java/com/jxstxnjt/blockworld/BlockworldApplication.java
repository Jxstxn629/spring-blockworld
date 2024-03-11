package com.jxstxnjt.blockworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class BlockworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockworldApplication.class, args);
	}

	@GetMapping("/health-check")
	public String healthCheck() {
		return "Healthy!";
	}
}
