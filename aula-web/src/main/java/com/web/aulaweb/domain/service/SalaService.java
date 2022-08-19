package com.web.aulaweb.domain.service;

import java.util.List;

import com.web.aulaweb.domain.assembler.SalaAssembler;
import com.web.aulaweb.domain.exception.DefaultException;
import com.web.aulaweb.domain.integration.FinanceiroFeing;
import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.repository.SalaRepository;
import com.web.aulaweb.domain.resource.SalaRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalaService {

    private final SalaRepository salaRepository;
    private final SalaAssembler salaAssembler;
    private final FinanceiroFeing financeiroFeing;

    public Sala salvar(SalaRequest salaRequest){
        return salaRepository.save(salaAssembler.toModel(salaRequest));
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

    public Sala atualizarSala(Long id, SalaRequest salaRequest){

        var valorMensalidade = financeiroFeing.calcularMensalidadeSala(id);

        var entity = buscarPorIdOuFalhar(id);

        verificarDescricaoPadraoEfalhar(salaRequest.getDescricao(), salaRequest.getTurma());
     
        BeanUtils.copyProperties(salaRequest, entity, "id");

        return salaRepository.save(entity);

    }

    public void verificarDescricaoPadraoEfalhar(String descricao, String turma){
        var entity = salaRepository.findByDescricaoAndTurma(descricao,turma);

        if(entity.isPresent()){
            throw new DefaultException(HttpStatus.BAD_REQUEST, "Não é possivel atualizar este registro com essa descrição");
        }
    }

    public Sala atualizarDescricaoSala(Long id, String descricao){

        var entity = buscarPorIdOuFalhar(id);

        entity.setDescricao(descricao);

        return salaRepository.save(entity);

    }

    
}
