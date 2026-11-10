package Observer;

public class Vendas implements Observer {
int ultimoValor = 1;
    @Override 
    public void atualizar(String nome, int estoque){
    if(ultimoValor == 0 && estoque > 0){
        System.out.println("aviso, estoque de " + nome + " re abastecido: " + estoque + " restantes.");
    }
    ultimoValor = estoque;

}
}
