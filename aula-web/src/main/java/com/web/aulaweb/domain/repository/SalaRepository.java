package com.web.aulaweb.domain.repository;
import java.util.List;
import java.util.Optional;

import com.web.aulaweb.domain.model.Sala;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalaRepository extends JpaRepository<Sala, Long>  {
    
    Optional<Sala> findByDescricaoAndTurma(String descricao, String turma);

    @Query("select sala FROM Sala sala WHERE sala.numeroAlunos >= :maior")
    List<Sala> findBySalaAlunosMaiorQue(Integer maior);
    
}
