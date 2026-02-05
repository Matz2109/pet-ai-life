package com.pal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PalApplication.class, args);
	}

}
