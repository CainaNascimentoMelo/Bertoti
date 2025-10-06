public class EventoConferencia extends Evento {
    private String nome;
    private String data;
    private String local;
    
    public EventoConferencia(String nome, String data, String local) {
        this.nome = nome;
        this.data = data;
        this.local = local;
    }
    
    @Override
    public void alterarData(String novaData) {
        this.data = novaData;
        String mensagem = "Data do evento '" + nome + "' alterada para: " + novaData;
        System.out.println(">>> " + mensagem);
        notificarParticipantes(mensagem);
    }
    
    @Override
    public void alterarLocal(String novoLocal) {
        this.local = novoLocal;
        String mensagem = "Local do evento '" + nome + "' alterado para: " + novoLocal;
        System.out.println(">>> " + mensagem);
        notificarParticipantes(mensagem);
    }
    
    public void adicionarPalestra(String palestra) {
        String mensagem = "Nova palestra adicionada ao evento '" + nome + "': " + palestra;
        System.out.println(">>> " + mensagem);
        notificarParticipantes(mensagem);
    }
    
    public String getNome() { return nome; }
    public String getData() { return data; }
    public String getLocal() { return local; }
}