package Singleton;

public class Guiche1 {
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
//todos os guiches tao de boa so chamar pelo gerador ou seja la qual seja o singleton,
