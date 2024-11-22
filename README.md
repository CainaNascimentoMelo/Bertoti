# Eng. de Software

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

Comparando a programação e a engenharia de software, encontramos 3 diferenças cruciais, que são o tempo, a escala e as situações que estão em jogo. Os engenheiros de sofware, quando fazem parte de um projeto, estão preocupados com o tempo necessário para o projeto se concretizar, além das possíveis mudanças. Junto disso, eles são responsáveis pela tomada de decisões complexas, com um alto risco e também estão mais preocupados com a eficiência do projeto do que a organização que o está produzindo.

# Exemplos de Trade-Off

1. O desenvolvimento de projetos em determinadas linguagens, já que cada uma tem uma função, vantagens e desvantagens diferentes.

2. Ao invês de uma metodologia tradicional, utilizar uma metodologia agil, buscando maior flexibilização e fácil adaptação em determinado projeto.

# Códigos

```java
public class Carros {
    
    private String modelo;
    private String numeroPlaca;

public Carro(String modelo, String numeroPlaca) {
        this.modelo = modelo;
        this.numeroPlaca = numeroPlaca;
    }

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
```

```java
import java.util.List;
import java.util.LinkedList;

public class Estacionamento {

    private List<Carros> Carros = new LinkedList<Carros>();
    
    public void cadastrarCarros(Carros carros) {
        carros.add(Carros); 
    }
    
 
    public List<Carros> buscarCarrosPorModelo(String modelo) {
        List<Carros> CarrosEncontrados = new LinkedList<Carros>();
        for(Carros carros : carros) {  
            if(carros.getModelo().equals(modelo)) 
                carrosEncontrados.add(carros); 
        }
        return carrosEncontrados;  
    }
    
    public List<Carros> getCarros() {
        return carros;  
    }
}
```

```java
  import static org.junit.jupiter.api.Assertions.*;  
import java.util.List; 
import org.junit.jupiter.api.Test;  

class Teste {

    @Test
    void test() {
        
        Estacionamento estacionamentoPereira = new Estacionamento();
        
       Carro Argo123 = new Carro("Argo", "ABC123");
        
        estacionamentoPereira.cadastrarCarros(Argo123);

        assertEquals(estacionamentoPereira.getCarro().size(), 2);
        
        List<Carro> argos = estacionamentoPereira.buscarCarrosPorModelo("Argo123");
        
        assertEquals(argos.get(0).getNumeroPlaca(), argo123.getNumeroplaca());
    }
}
```

![Modelo UML](https://github.com/user-attachments/assets/02d03f8b-efc2-4872-a028-0e1ecb51d62c)

