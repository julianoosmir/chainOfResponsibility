import java.math.BigDecimal;

public class DescontoPorValor extends Desconto{

    public DescontoPorValor(Desconto desconto){
        super(desconto);

    }
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().intValue() > 500){
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.50));
        }
        return this.proximo.calcular(orcamento);
    }
}
