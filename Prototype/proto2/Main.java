package Prototype.proto2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Operadora cvc = new Operadora("cvc", "123");

        Operadora nautica = new Operadora("nautica", "456");

        Pacote exemplo1 = new Pacote("rio", 100.00, cvc, new ArrayList<>(List.of("Ciranda","sei la")));

        Pacote exemplo1Segundo = new Pacote("curitoba", 30.00, cvc, new ArrayList<>(List.of("Nada")));

        Pacote exemplo2 = exemplo1.clonar();

        exemplo1.imprimirResumo();

        exemplo1Segundo.getOperadora().setTelefone("111");

        exemplo1.imprimirResumo();

        exemplo2.imprimirResumo();

        exemplo2.atualizarPacote(300.00, "sao paulo", nautica, new ArrayList<>(List.of("Mega fashion", "giga style")));

        exemplo2.imprimirResumo();

        Pacote exemplo3 = exemplo2.clonar();

        exemplo3.imprimirResumo();

        exemplo3.atualizarPacote(400.00, "bahia", nautica, new ArrayList<>(List.of("menos fashion")));

        exemplo2.getOperadora().setNome("Resenha");
    
        exemplo3.imprimirResumo();

        exemplo2.imprimirResumo();
        

    }
}
