package com.web.aulaweb.domain.service;

import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.repository.SalaRepository;
import com.web.aulaweb.domain.resource.SalaRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalaService {

    private final SalaRepository salaRepository;

    public Sala salvar(SalaRequest salaRequest){

        return salaRepository.save(salaRequest.converterClasse());

    }

 
    
}
