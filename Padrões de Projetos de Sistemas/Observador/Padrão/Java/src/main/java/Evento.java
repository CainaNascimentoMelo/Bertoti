import java.util.ArrayList;
import java.util.List;

public abstract class Evento {
    private List<Participante> participantes = new ArrayList<>();
    
    public void adicionarParticipante(Participante participante) {
        participantes.add(participante);
    }
    
    public void removerParticipante(Participante participante) {
        participantes.remove(participante);
    }
    
    public void notificarParticipantes(String mensagem) {
        for (Participante participante : participantes) {
            participante.atualizar(mensagem);
        }
    }
    
    public abstract void alterarData(String novaData);
    public abstract void alterarLocal(String novoLocal);
}