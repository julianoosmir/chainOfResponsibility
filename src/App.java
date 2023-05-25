import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CalculadaoraDeDesconto calculadaoraDeDesconto = new  CalculadaoraDeDesconto();
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(600),1);
        Orcamento orcamento2 = new Orcamento(BigDecimal.valueOf(100),10);
        Orcamento orcamento3 = new Orcamento(BigDecimal.valueOf(100),1);

        System.out.println(calculadaoraDeDesconto.calcular(orcamento));
        System.out.println(calculadaoraDeDesconto.calcular(orcamento2));
        System.out.println(calculadaoraDeDesconto.calcular(orcamento3));


    }
}
