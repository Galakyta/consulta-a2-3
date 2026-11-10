package Prototype.proto1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
    Operadora operadora = new Operadora("CVC", "123-456");

    Pacote modelo = new Pacote(
        "Curitiba", 1000.00,
        new ArrayList<>(List.of("museu do olho", "Batel")),operadora

    );

    Pacote modelo3 = new Pacote("inferno",0.0, new ArrayList<>(List.of("museu do inferno", "casa do temer")), operadora);

    Pacote inferno = modelo3.clonar();
    Pacote saoPaulo = modelo.clonar();
    Pacote rioDeJaneiro = modelo.clonar();

    saoPaulo.setDestino("SaoPaulo");
    saoPaulo.setPrecobase(2000.00);
    saoPaulo.setPasseios(new ArrayList<>(List.of("Ibirapuera", "Galeria do rock")));

    rioDeJaneiro.setDestino("Rio");
    rioDeJaneiro.setPrecobase(3000.00);
    rioDeJaneiro.setPasseios(new ArrayList<>(List.of("Cristo redentor", "Pao de acucar")));
    
    System.out.println("modelo(curitiba): ");
    System.out.println("Destino: " + modelo.getDestino());
    System.out.println("preco base: " + modelo.getPrecobase());
    System.out.println("operadora: " + modelo.getOperadora().getnome());
    System.out.println("numero: " + modelo.getOperadora().getTelefone());
    System.out.println("Passeios: " + modelo.getPasseios());
    
    System.out.println("Rio de janeiro: ");
    System.out.println("Destino: " + rioDeJaneiro.getDestino());
    System.out.println("preco base: " + rioDeJaneiro.getPrecobase());
    System.out.println("operadora: " + rioDeJaneiro.getOperadora().getnome());
    System.out.println("numero: " + rioDeJaneiro.getOperadora().getTelefone());
    System.out.println("Passeios: " + rioDeJaneiro.getPasseios());

    System.out.println("Sao Paulo: ");
    System.out.println("Destino: " + saoPaulo.getDestino());
    System.out.println("preco base: " + saoPaulo.getPrecobase());
    System.out.println("operadora: " + saoPaulo.getOperadora().getnome());
    System.out.println("numero: " + saoPaulo.getOperadora().getTelefone());
    System.out.println("Passeios: " + saoPaulo.getPasseios());

    modelo.getOperadora().setNome("Eu mesmo");
    modelo.getOperadora().setTelefone("678-234");

    System.out.println("operadora: " + saoPaulo.getOperadora().getnome());
    System.out.println("operadora: " + rioDeJaneiro.getOperadora().getnome());
    System.out.println("operadora: " + modelo.getOperadora().getnome());
    System.out.println("telefone: " + saoPaulo.getOperadora().getTelefone());
    System.out.println("telefone: " + rioDeJaneiro.getOperadora().getTelefone());
        System.out.println("telefone: " + modelo.getOperadora().getTelefone());




    
    System.out.println("outros campos sao os mesmos, passeios?: " + (rioDeJaneiro.getPasseios() == modelo.getPasseios()));
    System.out.println("operadora é a mesma?: " + (saoPaulo.getOperadora() == rioDeJaneiro.getOperadora() && modelo.getOperadora() == rioDeJaneiro.getOperadora()));
    inferno.getPasseios().add("shoppings");
    System.out.println("teste:  " + inferno.getPasseios());  
    System.out.println(modelo3.getPasseios() == inferno.getPasseios());
    System.out.println("com o passeio adicionado: " + saoPaulo.getPasseios());

}
}
