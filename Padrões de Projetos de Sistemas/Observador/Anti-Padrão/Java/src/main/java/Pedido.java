public class Pedido {
    private String numeroPedido;
    
    public Pedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    
    public void atualizarEstoque(String produto, int novoEstoque) {
        System.out.println("[PEDIDO " + numeroPedido + "] Estoque de " + produto + " atualizado: " + novoEstoque);
    }
    
    public void atualizarPreco(String produto, double novoPreco) {
        System.out.println("[PEDIDO " + numeroPedido + "] Preço de " + produto + " alterado: R$ " + novoPreco);
    }
    
    public void processar() {
        System.out.println("Processando pedido " + numeroPedido);
    }
}