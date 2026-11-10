package Prototype.proto1;

public class Operadora {

private String nome;
private String telefone;

    public Operadora(String nome, String telefone) {
    this.nome = nome;
    this.telefone = telefone;
    }

    public Operadora(Operadora original){
        this.nome = original.nome;
        this.telefone = original.telefone;
    }

    public String getnome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;

    }


}
