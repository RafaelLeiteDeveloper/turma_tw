package com.web.aulaweb.domain.resource;

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
import org.springframework.web.bind.annotation.RequestParam;
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
    @GetMapping(path = "listar")
    public String buscar( @RequestParam(required = false) String nome, @RequestParam(required = false) Integer idade){
        return "Requisição feita do verbo buscar o nome é " + nome + " e sua idade é " + idade;
    }

    // PARAMETROS FORNECIDOS PELO PATHVARIABEL
    @GetMapping(path = "{idade:[0-9]+}")
    public String buscarTodos(@PathVariable Integer idade){
        return "sua idade é " + idade;
    }



    @PutMapping(path = "{id}")
    public String update(@PathVariable Long id, @RequestBody SalaRequest salaRequest){
        return "id igual " + id + " obj: " + salaRequest;
    }

    @PatchMapping(path = "nome/{id}")
    public String atualizarUnico(@PathVariable Long id, @RequestBody String nome ){
        return "id=" + id + " nome = " + nome;
    }

    @DeleteMapping(path = "{id}")
    public String deletar(@PathVariable Long id){
        return null;
    }

    

}
