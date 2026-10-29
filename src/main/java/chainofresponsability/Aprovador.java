package chainofresponsability;

public abstract class Aprovador {

    protected Aprovador proximo;

    public void setProximo(Aprovador aprovador) {
        this.proximo = aprovador;
    }

    public abstract String aprovar(TipoDespesa despesa);
}