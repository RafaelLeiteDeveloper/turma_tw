package com.web.aulaweb.domain.resource;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import com.web.aulaweb.domain.model.Sala;

import lombok.Data;

@Data
public class SalaRequest {

    @NotNull(message = "O Campo descrição não pode ser nulo")
    @NotEmpty(message = "O Campo descrição não pode ser vazio")
    @NotBlank(message = "O Campo descrição não pode ser vazio")
    String descricao;

    @PositiveOrZero
    Integer numeroAlunos;

    String turma;

    public Sala converterClasse(){
        return Sala.builder()
            .descricao(this.descricao)
            .numeroAlunos(this.numeroAlunos)
            .turma(this.turma)
            .build();
    }
  
}
