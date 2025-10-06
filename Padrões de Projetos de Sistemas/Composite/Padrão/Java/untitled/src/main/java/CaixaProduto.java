import java.util.ArrayList;
import java.util.List;

public class CaixaProduto implements Produto {
    private String nome;
    private List<Produto> produtos = new ArrayList<>();
    
    public CaixaProduto(String nome) {
        this.nome = nome;
    }
    
    public void adicionar(Produto produto) {
        produtos.add(produto);
    }
    
    public void remover(Produto produto) {
        produtos.remove(produto);
    }
    
    @Override
    public double getPreco() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    public void mostrarConteudo() {
        System.out.println("Conteúdo da " + nome + ":");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getNome() + ": R$ " + produto.getPreco());
        }
        System.out.println("Total: R$ " + getPreco());
    }
}