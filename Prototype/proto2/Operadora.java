package  Prototype.proto2;

public class Operadora {

    String nome;
    String telefone;

    public Operadora(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void imprimirOperadora(){
        System.out.println("Operadora: " + nome + "Telefone: " + telefone);
    }

    public String getNomeOperadora() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
}
