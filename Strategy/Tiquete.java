package Strategy;

public class Tiquete {
    String placa;
    int minutos;
    Cobranca modalidade;

    public Tiquete(String placa, int minutos, Cobranca modalidade) {
        this.placa = placa;
        this.minutos = minutos;
        this.modalidade = modalidade;
    }

    public void setModalidade(Cobranca modalidade){
        if(this.modalidade == modalidade){
            System.out.println( "O tiquete ja possui esta modalidade");
            return;
        }
        this.modalidade = modalidade;
    }

    public double calcularValor(){
        return modalidade.calcularCobranca(minutos);
    }

    public void resumoDoTiquete(){
        System.out.println("placa do carro: " + placa);
        System.out.println("modalidade: " + modalidade.getClass().getSimpleName());
        System.out.println("valor a ser pago: " + calcularValor());
    }


    //a classe do que vai receber a estrategia precisa ficar separado

}
