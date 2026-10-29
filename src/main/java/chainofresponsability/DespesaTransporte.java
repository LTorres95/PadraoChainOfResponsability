package chainofresponsability;

public class DespesaTransporte implements TipoDespesa {

    private double valor;
    private String descricao;

    public DespesaTransporte(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
}