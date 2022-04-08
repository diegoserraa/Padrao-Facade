package padroesestruturais.facade;

public class Pessoa {

    public boolean contratar() {
        return PessoaFacade.verificarPendenciasContrato(this);
    }
}
