package Singleton;

public class GeradorDeSenhaSingleton {

    private static GeradorDeSenhaSingleton gerador;

    private int contagem = 0;

    private GeradorDeSenhaSingleton(){
        System.out.println("registro criado");
    }

    public static synchronized GeradorDeSenhaSingleton getInstancia(){
        if(gerador == null){
            gerador = new GeradorDeSenhaSingleton();
        }
        return gerador;
    }

    public void tirarSenha(){
        contagem++;
        System.out.println("Sua senha é: " + contagem); 
    }

    public int getContagem(){
        return contagem;
    }

    public void setContagem(int contagem){
        this.contagem = contagem;
    }
    

    
}
