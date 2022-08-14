package com.web.aulaweb.domain.integration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "acessos", url = "http://localhost:8080") 
public interface SalaFinanceiro {

    @GetMapping(path = "sala-mensalidade/{id}")
	Long calcularMensalidadeSala(@PathVariable("id") Long id);
    
}
