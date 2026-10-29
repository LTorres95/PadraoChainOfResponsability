package chainofresponsability;

public class Supervisor extends Aprovador {

    @Override
    public String aprovar(TipoDespesa despesa) {
        if (despesa.getValor() <= 500) {
            return "Supervisor aprovou";
        }

        return proximo.aprovar(despesa);
    }
}