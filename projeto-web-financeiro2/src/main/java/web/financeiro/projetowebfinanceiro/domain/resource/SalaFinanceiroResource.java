package web.financeiro.projetowebfinanceiro.domain.resource;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "sala-mensalidade")
public class SalaFinanceiroResource {

    @GetMapping(path = "{id:[0-9]+}")
    public BigDecimal calcularValorMensalidadeAlunoSala(@PathVariable Long idAluno){

        //buquei informações ALunoBanco
        return new BigDecimal(1000);

    }
    
}
