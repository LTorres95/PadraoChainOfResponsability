package chainofresponsability;

public class Diretor extends Aprovador {

    @Override
    public String aprovar(TipoDespesa despesa) {
        return "Diretor aprovou";
    }
}