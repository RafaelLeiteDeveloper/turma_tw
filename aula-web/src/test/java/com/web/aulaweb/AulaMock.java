package com.web.aulaweb;

import com.web.aulaweb.domain.exception.DefaultException;
import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.repository.SalaRepository;
import com.web.aulaweb.domain.resource.SalaRequest;
import com.web.aulaweb.domain.service.SalaService;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@SpringBootTest
public class AulaMock {

    @InjectMocks
    private SalaService salaSercice;

    @Mock
    private SalaRepository salaRepository;

    @Test
    void buscarPorId() {
        when(salaRepository.findById(any())).thenReturn(Optional.of(mockSala()));
        final var updated = salaSercice.buscarPorIdOuFalhar(1l);
        assertEquals(updated, mockSala());

    }

    @Test
    void atualizar() {
        when(salaRepository.findById(any())).thenReturn(Optional.of(mockSala()));
        when(salaRepository.findByDescricaoAndTurma(any(),any())).thenReturn(Optional.of(mockSala()));
        var ex = assertThrows(DefaultException.class, () -> {
            salaSercice.atualizarSala(1l,mockSalaRequest());
        } );

        assertEquals(HttpStatus.BAD_REQUEST, ex.httpStatus);

    }

    Sala mockSala(){
        Sala sala = new Sala();
        sala.setDescricao("teste");
        sala.setId(1l);
        sala.setPredio("teste");
        sala.setTurma("teste");
        return sala;
    }

    SalaRequest mockSalaRequest(){
        SalaRequest sala = new SalaRequest();
        sala.setDescricao("teste");
        sala.setPredio("teste");
        sala.setTurma("teste");
        return sala;
    }
   

    
}
