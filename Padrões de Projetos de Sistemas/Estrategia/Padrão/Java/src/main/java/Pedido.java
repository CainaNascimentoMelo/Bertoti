public class Pedido {
    private String numero;
    private double valor;
    private PagamentoStrategy estrategiaPagamento;
    
    public Pedido(String numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }
    
    public void setEstrategiaPagamento(PagamentoStrategy estrategia) {
        this.estrategiaPagamento = estrategia;
    }
    
    public void processarPagamento() {
        if (estrategiaPagamento != null) {
            estrategiaPagamento.processarPagamento(valor);
        } else {
            System.out.println("Nenhuma estratégia de pagamento definida!");
        }
    }
    
    public String getNumero() {
        return numero;
    }
}