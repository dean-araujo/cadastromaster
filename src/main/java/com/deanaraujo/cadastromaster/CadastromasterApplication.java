package com.deanaraujo.cadastromaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CadastromasterApplication {

	@Value("${application.name}")
	private String applicationName;

	@GetMapping("/teste")
	public String teste(){
		return applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(CadastromasterApplication.class, args);
	}

}
