package com.web.aulaweb.util;

import com.web.aulaweb.domain.exception.DefaultException;
import org.springframework.http.HttpStatus;

public class CamelCaseConver {

    public String converter(String descricao){
        return descricao.substring(0,1).toUpperCase() + descricao.substring(1).toLowerCase();
    }

    public boolean verificarRegraTotalAlunos(Integer totalAlunos){
        return totalAlunos >= 10;
    }

    public void lancarVerificacaoTotalALunosSala(Integer totalAlunos){

        if(!verificarRegraTotalAlunos(totalAlunos)){
            throw new DefaultException(HttpStatus.BAD_GATEWAY,"Erro na regra total de alunos");
        }

    }
}
