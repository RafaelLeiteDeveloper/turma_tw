package com.web.aulaweb;

import com.web.aulaweb.domain.model.Aluno;
import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.repository.SalaRepository;
import com.web.aulaweb.domain.service.SalaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AulaWebApplication.class, args);	
	}

}
