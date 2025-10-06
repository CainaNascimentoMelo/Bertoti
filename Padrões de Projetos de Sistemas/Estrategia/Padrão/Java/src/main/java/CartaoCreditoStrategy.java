public class CartaoCreditoStrategy implements PagamentoStrategy {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com cartão de crédito...");
        System.out.println(">>> Cobrando taxa de 2.5%: R$ " + (valor * 0.025));
        System.out.println(">>> Valor total: R$ " + (valor + (valor * 0.025)));
        System.out.println(">>> Validando limite do cartão...");
    }
}