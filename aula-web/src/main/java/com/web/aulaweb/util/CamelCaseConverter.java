package com.web.aulaweb.util;

import com.web.aulaweb.domain.exception.DefaultException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class CamelCaseConverter {

    public String converter(String nome) {
    	System.out.println(nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase());
		return nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
	}

	public boolean minimoAlunos(int numero){
        return numero >= 10;
    }

	public void minimoregra(int numero){
		if(minimoAlunos(numero)){
			throw new DefaultException(HttpStatus.BAD_GATEWAY, "erro");
		}
	}

    
}
