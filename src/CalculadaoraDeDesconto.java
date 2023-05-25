import java.math.BigDecimal;

public class CalculadaoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoPorItens(new DescontoPorValor(new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
