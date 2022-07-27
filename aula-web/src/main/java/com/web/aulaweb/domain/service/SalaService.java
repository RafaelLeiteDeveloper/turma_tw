package com.web.aulaweb.domain.service;

import java.util.List;

import com.web.aulaweb.domain.exception.DefaultException;
import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.repository.SalaRepository;
import com.web.aulaweb.domain.resource.SalaRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalaService {

    private final SalaRepository salaRepository;

    public Sala salvar(SalaRequest salaRequest){

        return salaRepository.save(salaRequest.converterClasse());

    }

    public List<Sala> buscarTodos(){
        return salaRepository.findAll();
    }

    public Sala buscarPorIdOuFalhar(Long id){

        return salaRepository.findById(id)
        .orElseThrow(new DefaultException(HttpStatus.BAD_REQUEST,"A sala informada não existe"));

    }

    public void deletar(Long id){
        var objeto = buscarPorIdOuFalhar(id);
        salaRepository.delete(objeto);
    }

 
    
}
