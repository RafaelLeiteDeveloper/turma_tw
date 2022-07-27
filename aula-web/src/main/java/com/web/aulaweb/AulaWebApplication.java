package com.web.aulaweb;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AulaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaWebApplication.class, args);	
	}

	@Bean
	public ModelMapper modelMapper() {
	   ModelMapper modelMapper = new ModelMapper();
	   return modelMapper;
	}

}
