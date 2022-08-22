package com.web.aulaweb.domain.resource;

import java.time.LocalDateTime;
import java.util.List;

import javax.print.attribute.standard.Media;
import javax.validation.Valid;

import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.service.SalaService;

import org.hibernate.annotations.Cache;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
@RequestMapping(value = "endereco")
@AllArgsConstructor
public class EnderecoTesteResource {

    @GetMapping(path = "todos")
    public void buscar() {
        System.out.println("ok");
    }

}
