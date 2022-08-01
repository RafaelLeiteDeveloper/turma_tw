package com.web.aulaweb.domain.assembler;

import java.util.List;
import java.util.stream.Collectors;

import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.resource.SalaRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalaAssembler {

    private final ModelMapper modelMapper;

    public Sala toModel(SalaRequest salaRequest){
        return modelMapper.map(salaRequest, Sala.class);
    }

    public List<Sala> toCollectionModel(List<SalaRequest> salasRequest){
        //lambda functions JAVA 8
        return  salasRequest.stream()
                             .map(sala -> toModel(sala))
                             .collect(Collectors.toList());                             
    }
    
}
