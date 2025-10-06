public class Main {
    public static void main(String[] args) {
       
        Produto livro = new ProdutoIndividual("Livro Java", 50.0);

        CaixaProduto caixaPequena = new CaixaProduto("Caixa de Material de Estudo");
        caixaPequena.adicionar(livro);
        
        CaixaProduto caixaGrande = new CaixaProduto("Caixa Grande de Material Escolar");
        caixaGrande.adicionar(caixaPequena);
     
        System.out.println("=== CAIXA PEQUENA ===");
        caixaPequena.mostrarConteudo();
        
        System.out.println("\n=== CAIXA GRANDE ===");
        caixaGrande.mostrarConteudo();
        
        System.out.println("\n=== PREÇOS INDIVIDUAIS ===");
        System.out.println("Livro: R$ " + livro.getPreco());
    }
}