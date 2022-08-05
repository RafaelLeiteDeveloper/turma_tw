package com.web.aulaweb;

import com.web.aulaweb.domain.exception.DefaultException;
import com.web.aulaweb.domain.model.Sala;
import com.web.aulaweb.domain.repository.SalaRepository;
import com.web.aulaweb.domain.resource.SalaRequest;
import com.web.aulaweb.domain.service.SalaService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
public class MockTeste {

    @InjectMocks
    private SalaService salaService;

    @Mock
    private SalaRepository salaRepository;

    @Test
    public void testarBuscaPorId(){
        var obj = mockSala();
        when(salaRepository.findById(any())).thenReturn(Optional.of(obj));
        var mock = salaService.buscarPorIdOuFalhar(1l);
        assertEquals(mock,obj);
    }

    @Test
    public void testarResgistroExistenteNoBancoAoSalvarSAla(){
        var obj = mockSala();
        when(salaRepository.findById(any())).thenReturn(Optional.of(obj));
        when(salaRepository.findByDescricaoAndTurma(any(),any())).thenReturn(mockSalaDescricaoETurmaExistente());

        var ex = assertThrows(DefaultException.class, () -> {
            salaService.atualizarSala(1l,mockSalaRequest());
        });

        assertEquals(HttpStatus.BAD_REQUEST,ex.httpStatus);
    }

    public Sala mockSala(){
        Sala sala = new Sala();
        sala.setId(1l);
        return sala;
    }

    public Optional<Sala> mockSalaDescricaoETurmaExistente(){
        Sala sala = new Sala();
        sala.setDescricao("teste");
        sala.setTurma("teste");
        sala.setId(2l);
        return Optional.of(sala);
    }

    public SalaRequest mockSalaRequest(){
        SalaRequest salaRequest = new SalaRequest();
        salaRequest.setDescricao("teste");
        return salaRequest;
    }


}
