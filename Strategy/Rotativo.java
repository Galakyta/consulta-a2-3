package Strategy;
 
public class Rotativo implements Cobranca {
private final double valorFixo = 15.00;
@Override 
public double calcularCobranca(int minutos){
    double horas = Math.ceil(minutos / 60.0);

    return valorFixo * horas;
}
}
