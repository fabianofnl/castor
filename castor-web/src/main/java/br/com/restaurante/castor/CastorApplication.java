package br.com.restaurante.castor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.restaurante")
public class CastorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CastorApplication.class, args);
	}

}
