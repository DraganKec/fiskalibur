package org.fiskalibur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class FiskaliburApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiskaliburApplication.class, args);
	}

}
