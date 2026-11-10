package Observer;

public class Auditoria implements Observer {
@Override 
    public void atualizar(String nome, int estoque){
    
 System.out.println("estoque de " + nome + " alterado: " + estoque + " restantes.");
    
}
}
