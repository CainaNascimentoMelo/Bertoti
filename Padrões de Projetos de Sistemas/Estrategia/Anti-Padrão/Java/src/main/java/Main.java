public class Main {
    public static void main(String[] args) {
        System.out.println("=== ANTI-PADRÃO - SEM STRATEGY ===");
        
        Pedido pedido1 = new Pedido("001", 100.0, "CARTAO_CREDITO");
        Pedido pedido3 = new Pedido("003", 150.0, "PIX");
        
        pedido1.processarPagamento();
        System.out.println();
        
        pedido3.processarPagamento();
    }
}