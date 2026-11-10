package Singleton;

public class GeradorDeSenhaSingleton {

    //singleton, a estancia gerador n precisa inicializar pq ela entra depois pelo get instancia

    //o construto tem so o print pq ele so precisa avisar que saiu, o private serve pra limitar o acesso e n deixar mais o resto do programa acessar

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

    //if gerador == null se nao tem nada nele, dai retorna o gerador, se nao for pode relaxar

    public void tirarSenha(){
        contagem++;
        System.out.println("Sua senha é: " + contagem); 
    }
    //o ++ vai fora as usual

    public int getContagem(){
        return contagem;
    }

    public void setContagem(int contagem){
        this.contagem = contagem;
    }
    

    
}
