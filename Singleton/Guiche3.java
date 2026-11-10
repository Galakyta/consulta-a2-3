package Singleton;

public class Guiche3 {
 public void tirarSenha(){
    GeradorDeSenhaSingleton.getInstancia().tirarSenha();
 }
 public void zerarContagem(){
    GeradorDeSenhaSingleton.getInstancia().setContagem(0);
 }

 public void consultarOrdem(){
        System.out.println("ultima senha impressa: " + GeradorDeSenhaSingleton.getInstancia().getContagem());
    }
}
