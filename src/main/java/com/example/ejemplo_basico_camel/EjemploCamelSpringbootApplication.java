package com.example.ejemplo_basico_camel;

import lombok.SneakyThrows;
import org.apache.camel.main.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjemploCamelSpringbootApplication {
	@SneakyThrows
	public static void main(String[] args) {
		Main main = new Main();
		main.configure().addRoutesBuilder(new MyRouteBuilder());
		main.run(args);
	}
}
