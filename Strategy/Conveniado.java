package Strategy;

public class Conveniado implements Cobranca {
private final double valorFixo = 15.0;
private final double desconto = 0.30;
@Override 
public double calcularCobranca(int minutos){
    if(minutos <= 30){
        return 0.0;
    }
    double horas = Math.ceil(minutos / 60.0);

    return (valorFixo - valorFixo * desconto) * horas;
}
}
