import java.math.BigDecimal;

public class DescontoPorItens extends Desconto{

    public DescontoPorItens(Desconto proximo){
        super(proximo);
    }
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidadeitens() > 5){
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.10));
        }
        return proximo.calcular(orcamento);
    }
}
