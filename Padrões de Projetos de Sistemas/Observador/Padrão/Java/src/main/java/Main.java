public class Main {
    public static void main(String[] args) {
        System.out.println("=== PADRÃO OBSERVER ===");
        
        EventoConferencia conferencia = new EventoConferencia(
            "Conferência de Tecnologia 2024", 
            "15/12/2024", 
            "Centro de Convenções"
        );
        
        Participante participante1 = new ParticipanteEvento("João Silva", "joao@email.com");
        
        conferencia.adicionarParticipante(participante1);

        System.out.println("=== INSCRIÇÕES REALIZADAS ===");
        System.out.println("Evento: " + conferencia.getNome());
        System.out.println("Data: " + conferencia.getData());
        System.out.println("Local: " + conferencia.getLocal());
        System.out.println();
        
        System.out.println("=== ALTERAÇÃO DE DATA ===");
        conferencia.alterarData("20/12/2024");
        System.out.println();
        
        System.out.println("=== ALTERAÇÃO DE LOCAL ===");
        conferencia.alterarLocal("Hotel Premium");
        System.out.println();
        
        System.out.println("=== NOVA PALESTRA ===");
        conferencia.adicionarPalestra("Inteligência Artificial Aplicada");
        System.out.println();

        System.out.println("=== NOVO PARTICIPANTE ===");
        Participante participante2 = new ParticipanteEvento("Ana Costa", "ana@email.com");
        conferencia.adicionarParticipante(participante2);
        
        conferencia.alterarLocal("Auditório Principal");
    }
}