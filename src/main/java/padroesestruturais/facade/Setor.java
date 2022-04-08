package padroesestruturais.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Pessoa> pessoasComPendencia = new ArrayList<Pessoa>();

    public void addPessoaPendente(Pessoa pessoa) {
        this.pessoasComPendencia.add(pessoa);
    }

    public boolean verificarPessoasComPendencia(Pessoa pessoa) {
        return this.pessoasComPendencia.contains(pessoa);
    }

}

