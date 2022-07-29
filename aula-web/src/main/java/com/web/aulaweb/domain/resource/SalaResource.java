package com.web.aulaweb.domain.resource;

import java.util.List;

import javax.print.attribute.standard.Media;
import javax.validation.Valid;

import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.service.SalaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
@RestController
@RequestMapping(value = "sala")
@AllArgsConstructor
public class SalaResource {

    private final SalaService salaService;

    @PostMapping
    public Sala salvar(@RequestBody @Valid SalaRequest salaRequest){
        return salaService.salvar(salaRequest);
    }

    //PARAMETROS FORNECIDOS PELO QUERY STRING
    @GetMapping(path = "todos")
    public List<Sala>  buscar() {
        return salaService.buscarTodos();
    }

    // PARAMETROS FORNECIDOS PELO PATHVARIABEL
    @GetMapping(path = "{id:[0-9]+}")
    public Sala buscarTodos(@PathVariable Long id){
        return salaService.buscarPorIdOuFalhar(id);
    }

    @DeleteMapping(path = "{id}")
    public void deletar(@PathVariable Long id){
        salaService.deletar(id);
    }

    @PutMapping(path = "{id}")
    public Sala update(@PathVariable Long id, @RequestBody SalaRequest salaRequest){
        return salaService.atualizarSala(id, salaRequest);
    }

    @PatchMapping(path = "descricao/{id}")
    public Sala atualizarUnico(@PathVariable Long id, @RequestBody String descricao ){
        return salaService.atualizarDescricaoSala(id, descricao);
    }

}
