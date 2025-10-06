public class Produto {
    private String nome;
    private double preco;
    private int estoque;
    private Pedido pedido; 
    
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public void vender(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Vendido " + quantidade + " unidades de " + nome);
            
            if (pedido != null) {
                pedido.atualizarEstoque(nome, estoque);
            }
        } else {
            System.out.println("Estoque insuficiente de " + nome);
        }
    }
    
    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        System.out.println("Preço de " + nome + " alterado para R$ " + novoPreco);
        
        if (pedido != null) {
            pedido.atualizarPreco(nome, novoPreco);
        }
    }
    
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }
}