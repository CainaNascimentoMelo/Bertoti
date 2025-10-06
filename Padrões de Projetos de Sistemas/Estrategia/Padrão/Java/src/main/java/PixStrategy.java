public class PixStrategy implements PagamentoStrategy {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento com PIX...");
        System.out.println(">>> Sem taxas adicionais");
        System.out.println(">>> Valor total: R$ " + valor);
        System.out.println(">>> Gerando QR Code...");
    }
}