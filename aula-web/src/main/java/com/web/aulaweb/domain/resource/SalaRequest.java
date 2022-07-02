package com.web.aulaweb.domain.resource;

import com.web.aulaweb.domain.model.Sala;

import lombok.Data;

@Data
public class SalaRequest {
    private Long id;
    private String descricao;
    private Integer numeroAlunos;
    private String turma;

    public Sala convert(){
        Sala sala = new Sala();
        sala.setDescricao(this.descricao);
        sala.setNumeroAlunos(this.numeroAlunos);
        sala.setTurma(this.turma);

        return sala;
        
    }
}
