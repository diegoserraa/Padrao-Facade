package padroesestruturais.facade;

public class PessoaFacade {

    public static boolean verificarPendenciasContrato(Pessoa pessoa) {
        if (Rh.getInstancia().verificarPessoasComPendencia(pessoa)) {
            return false;
        }
        if (Clinico.getInstancia().verificarPessoasComPendencia(pessoa)) {
            return false;
        }
        return true;
    }
}
