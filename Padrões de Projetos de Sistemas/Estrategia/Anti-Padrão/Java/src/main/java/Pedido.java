public class Pedido {
    private String numero;
    private double valor;
    private String tipoPagamento;
    
    public Pedido(String numero, double valor, String tipoPagamento) {
        this.numero = numero;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public void processarPagamento() {
        if ("CARTAO_CREDITO".equals(tipoPagamento)) {
            System.out.println("Processando pagamento com cartão de crédito...");
            System.out.println(">>> Cobrando taxa de 2.5%: R$ " + (valor * 0.025));
            System.out.println(">>> Valor total: R$ " + (valor + (valor * 0.025)));
            System.out.println(">>> Validando limite do cartão...");
        } 
        else if ("PIX".equals(tipoPagamento)) {
            System.out.println("Processando pagamento com PIX...");
            System.out.println(">>> Sem taxas adicionais");
            System.out.println(">>> Valor total: R$ " + valor);
            System.out.println(">>> Gerando QR Code...");
        }
        else {
            System.out.println("Método de pagamento não suportado!");
        }
    }
    
    public String getNumero() {
        return numero;
    }
}