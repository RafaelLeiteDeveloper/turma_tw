package com.web.aulaweb.domain.resource;

import com.web.aulaweb.domain.service.SalaService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("sala")
public class SalaResource {

    @Autowired
    private SalaService salaservice;

    @PostMapping
	public void salvar( @RequestBody SalaRequest salaRequest) {

        salaservice.salvar(salaRequest);
		
	}
    
}
