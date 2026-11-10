package Strategy;

public class Mensalista implements Cobranca{
    private static final double valorMensalista = 100.00;
    @Override 
    public double calcularCobranca(int minutos){
        return valorMensalista;
    }
}
