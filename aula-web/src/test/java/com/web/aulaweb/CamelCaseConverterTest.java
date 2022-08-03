package com.web.aulaweb;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.web.aulaweb.domain.exception.DefaultException;
import com.web.aulaweb.util.CamelCaseConverter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CamelCaseConverterTest {

    private CamelCaseConverter camelCase;
    
    @Test
    public void deveCriarUmaClasse() {
    	
    }

	@Test
	public void deveConverterNomeSimples() throws Exception {
        camelCase = new CamelCaseConverter();
		assertEquals("Lionel", camelCase.converter("lionel"));
	}
	
	@Test
	public void deveConverterNomeSimplesMisturadoMaiusculoEMinusculo() throws Exception {
		camelCase = new CamelCaseConverter();
		assertEquals("Lionel", camelCase.converter("lIOneL"));
	}

	@Test
	public void minimoalunos() throws Exception {
		assertTrue(camelCase.minimoAlunos(11));
	}

	@Test
	public void minimoalunosErro() throws Exception {
		assertThrows(DefaultException.class,  () -> {
            camelCase.minimoregra(11);
        });
	}
    
}
