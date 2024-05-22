package com.alura.generadorDeFrases;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// ******** Para Deshabilitar la auto-configuración de la base de datos sino marcara error *******
// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication
public class GeneradorDeFrasesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneradorDeFrasesApplication.class, args);
	}
}
