public class ProdutoIndividual implements Produto {
    private String nome;
    private double preco;
    
    public ProdutoIndividual(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
}