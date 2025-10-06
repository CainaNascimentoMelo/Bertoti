public class Main {
    public static void main(String[] args) {
        System.out.println("=== PADRÃO STRATEGY ===");
        
        Pedido pedido1 = new Pedido("001", 100.0);
        Pedido pedido2 = new Pedido("002", 200.0);
        
        PagamentoStrategy cartao = new CartaoCreditoStrategy();
        PagamentoStrategy pix = new PixStrategy();
        
        pedido1.setEstrategiaPagamento(cartao);
        pedido1.processarPagamento();
        System.out.println();
        
        pedido2.setEstrategiaPagamento(pix);
        pedido2.processarPagamento();
        System.out.println();
        
        System.out.println("=== MUDANÇA DINÂMICA ===");
        pedido1.setEstrategiaPagamento(pix);
        pedido1.processarPagamento();
    }
}