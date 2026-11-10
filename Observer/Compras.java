package Observer;

public class Compras implements Observer {
@Override 
    public void atualizar(String nome, int estoque){
    if(estoque < 5){
        System.out.println("aviso, estoque de " + nome + " baixo: " + estoque + " restantes.");
    }
}
}
//so um exemplo dos observadores, por isso q a gente passa o subject por parametro