public class Main {
    public static void main(String[] args) {
        System.out.println("=== ANTI-PADRÃO OBSERVER ===");
        
        Produto produto1 = new Produto("Notebook", 2500.0, 10);
        
        Pedido pedido1 = new Pedido("P001");

        produto1.setPedido(pedido1);
        
        produto1.vender(2);
        
        System.out.println();
        
        produto1.setPreco(2300.0);
    }
}