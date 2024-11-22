# Eng. de Software

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

Comparando a programação e a engenharia de software, encontramos 3 diferenças cruciais, que são o tempo, a escala e as situações que estão em jogo. Os engenheiros de sofware, quando fazem parte de um projeto, estão preocupados com o tempo necessário para o projeto se concretizar, além das possíveis mudanças. Junto disso, eles são responsáveis pela tomada de decisões complexas, com um alto risco e também estão mais preocupados com a eficiência do projeto do que a organização que o está produzindo.

# Exemplos de Trade-Off

1. O desenvolvimento de projetos em determinadas linguagens, já que cada uma tem uma função, vantagens e desvantagens diferentes.

2. Ao invês de uma metodologia tradicional, utilizar uma metodologia agil, buscando maior flexibilização e fácil adaptação em determinado projeto.

# Códigos

public class Carros {
    // Criação das variáveis
    private String modelo;
    private String numeroPlaca;

    // Criação do objeto Carro
    public Carro(String modelo, String numeroPlaca) {
        this.modelo = modelo;
        this.numeroPlaca = numeroPlaca;
    }

    // Gets e Sets
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
}
