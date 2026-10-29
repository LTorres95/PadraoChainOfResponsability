package chainofresponsability;

public class Gerente extends Aprovador {

    @Override
    public String aprovar(TipoDespesa despesa) {
        if (despesa.getValor() <= 2000) {
            return "Gerente aprovou";
        }

        return proximo.aprovar(despesa);
    }
}