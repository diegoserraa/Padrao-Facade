package padroesestruturais.facade;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {



    @Test
    void deveRetornarPendenciaRhContratacao() {
        Pessoa pessoa = new Pessoa();
        Rh.getInstancia().addPessoaPendente(pessoa);

        assertEquals(false, pessoa.contratar());
    }



    @Test
    void deveRetornarPendenciaFinanceiroContratacao() {
        Pessoa pessoa = new Pessoa();
        Clinico.getInstancia().addPessoaPendente(pessoa);

        assertEquals(false, pessoa.contratar());
    }

    @Test
    void deveRetornarPessoaSemPendenciaContratacao() {
        Pessoa pessoa = new Pessoa();

        assertEquals(true, pessoa.contratar());
    }

}