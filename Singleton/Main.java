package Singleton;

public class Main {
public static void main(String[] args) {
    Guiche1 guiche1 = new Guiche1();
    Guiche2 guiche2 = new Guiche2();
    Guiche3 guiche3 = new Guiche3();

    guiche1.tirarSenha();
    guiche2.tirarSenha();
    guiche3.tirarSenha();

    guiche1.zerarContagem();

    guiche2.consultarOrdem();

    guiche3.consultarOrdem();
    
    

}
}
