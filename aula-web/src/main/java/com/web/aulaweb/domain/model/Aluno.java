package com.web.aulaweb.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "aluno")
@Data
@Builder
public class Aluno {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = true)
    private String nome;

    @Column(name = "idade")
    private Integer idade;

    @ManyToOne
    @JoinColumn(name = "id_sala")
    private Sala sala;

}
