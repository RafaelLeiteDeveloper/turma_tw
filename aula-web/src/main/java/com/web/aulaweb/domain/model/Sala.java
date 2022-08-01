package com.web.aulaweb.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.ManyToAny;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "sala")
@Data
public class Sala {

    public Sala(){

    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao", nullable = true, length = 60)
    private String descricao;

    @Column(name = "numero_alunos", nullable = true, length = 75)
    private Integer numeroAlunos;

    @Column(name = "turma")
    private String turma;

    @Column(name = "ano_formacao")
    private Integer anoFormacao;

    @Column(name = "predio")
    private String predio;

    @Transient
    private LocalDateTime horaDataAtual;

    
}
