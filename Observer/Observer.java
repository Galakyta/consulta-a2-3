package Observer;

public interface Observer {
public void atualizar(String nome, int estoque);
}

//Observer, ele sempre vai seguir o mesmo padrao, comeca pela interface publica, e vai ter so o atualizar, onde vc passa os atributos do subject

