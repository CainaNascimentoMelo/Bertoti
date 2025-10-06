public class ParticipanteEvento implements Participante {
    private String nome;
    private String email;
    
    public ParticipanteEvento(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    
    @Override
    public void atualizar(String mensagem) {
        System.out.println("[NOTIFICAÇÃO para " + nome + " - " + email + "] " + mensagem);
    }
    
    @Override
    public String getNome() {
        return nome;
    }
    
    public String getEmail() {
        return email;
    }
}