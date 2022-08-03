package com.web.aulaweb;

import com.web.aulaweb.domain.exception.DefaultException;
import com.web.aulaweb.util.CamelCaseConver;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class SalaTeste {

    @Test
    public void criarUmaClasseParaConverterString(){
        CamelCaseConver camel = new CamelCaseConver();
    }

    @Test
    public void converterStringParaCamelCase(){
        CamelCaseConver camel = new CamelCaseConver();
        assertEquals("Rafael",camel.converter("rafael"));
    }

    @Test
    public void deveConverterStringsMisturadasMauisculoEMInusculo(){
        CamelCaseConver camel = new CamelCaseConver();
        assertEquals("Rafael",camel.converter("raFael"));
    }

    @Test
    public void deveRetornarSeASalaTemMaisDe10Alunos(){
        CamelCaseConver camel = new CamelCaseConver();
        assertTrue(camel.verificarRegraTotalAlunos(10));
    }

    @Test
    public void deveFalharAoVerificarRegraTotalDeALunosPorSala(){
        assertThrows(DefaultException.class, () -> {
            CamelCaseConver camel = new CamelCaseConver();
            camel.lancarVerificacaoTotalALunosSala(9);
        } );
    }

}
