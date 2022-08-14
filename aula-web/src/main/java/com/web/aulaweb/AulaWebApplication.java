package com.web.aulaweb;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.resource.SalaRequest;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
@EnableFeignClients
public class AulaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaWebApplication.class, args);	
	}

	@Bean
	public ModelMapper modelMapper(){
		var modelMapper =  new ModelMapper();

		modelMapper.createTypeMap(SalaRequest.class, Sala.class)
		.addMapping(SalaRequest::getTotalAlunos, Sala::setNumeroAlunos);

		return modelMapper;

	}

}
