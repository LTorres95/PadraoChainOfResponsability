package chainofresponsability;

public class DespesaAlimentacao implements TipoDespesa {

    private double valor;
    private String descricao;

    public DespesaAlimentacao(double valor, String descricao) {
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