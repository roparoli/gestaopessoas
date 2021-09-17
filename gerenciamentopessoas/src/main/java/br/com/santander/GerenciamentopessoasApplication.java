package br.com.santander;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"br.com.springboot.model"})
public class GerenciamentopessoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentopessoasApplication.class, args);
	}

}
