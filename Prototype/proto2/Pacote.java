package  Prototype.proto2;
import java.util.ArrayList;
import java.util.List;

public class Pacote implements Prototype<Pacote>{

 private Operadora operadora;
 private String nome;
 private double custo; 
 private List<String> passeios = new ArrayList<>(); 

    public Pacote(String nome, double custo, Operadora operadora, List<String> passeios) {
    
        this.nome = nome;
        this.custo = custo;
        this.operadora = operadora;
        this.passeios = passeios;

    }

    private Pacote(Pacote original){
        this.nome = original.nome;
        this.custo = original.custo;
        this.operadora = original.operadora;
        this.passeios = new ArrayList<>(original.passeios);

    }
    @Override 
    public Pacote clonar(){
        return new Pacote(this);
    }

    public double getCusto() {
        return custo;
    }

    public Operadora getOperadora() {
        return operadora;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getPasseios() {
        return passeios;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public void setPasseios(List<String> passeios) {
        this.passeios = passeios;
    }

    public void imprimirResumo(){
        System.out.println("Operadora: " + operadora.getNomeOperadora() + "Telefone: " + operadora.getTelefone());
        System.out.println("Nome: " + getNome());
        System.out.println("Custo: " + getCusto());
        System.out.println("Passeios: " + getPasseios());
    }

    public void atualizarPacote(double custo, String nome, Operadora operadora, List<String> passeios){
        setCusto(custo);
        setNome(nome);
        setOperadora(operadora);
        setPasseios(passeios);

    }


}
