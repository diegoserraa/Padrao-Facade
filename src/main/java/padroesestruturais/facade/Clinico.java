package padroesestruturais.facade;

public class Clinico extends Setor {

    private static Clinico clinico = new Clinico();

    private Clinico() {};

    public static Clinico getInstancia() {
        return clinico;
    }
}
