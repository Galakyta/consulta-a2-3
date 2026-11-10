package Observer;
import java.util.ArrayList;
import java.util.List;

public class Produto implements Subject {
    private final List<Observer> observadores = new ArrayList<>();
    private final String nome;
    private int estoque;

    public Produto(String nome, int estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    

    @Override 
    public void inscrever(Observer observer){
        observadores.add(observer);
    }
    @Override 
    public void desinscrever(Observer observer){
        observadores.remove(observer);
    }
    @Override 
    public void pingarObservers(){
        for(Observer observer : observadores){
            observer.atualizar(nome, estoque);
        }

    }

    public void setEstoque(int estoque){
        if(this.estoque == estoque){
            return;
        }
        this.estoque = estoque;
        pingarObservers();
    }
}

//produto e so o subject da vez, mas a base e a mesma, subject = oq vai ser observado