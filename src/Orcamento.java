import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;

    private int quantidadeitens;

    public Orcamento(BigDecimal valor, int quantidadeitens) {
        this.valor = valor;
        this.quantidadeitens = quantidadeitens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidadeitens() {
        return quantidadeitens;
    }

    public void setQuantidadeitens(int quantidadeitens) {
        this.quantidadeitens = quantidadeitens;
    }
}