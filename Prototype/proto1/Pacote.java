package Prototype.proto1;
import java.util.ArrayList;
import java.util.List;

//a array list e pros passeios, o clone e private e acessado pelo metodo clonar tlgd

//copia deep = cria um novo igual, copia rasa = clona mas a aponta pro mesmo lugar
public class Pacote implements Prototipo<Pacote> {
    private List<String> passeios = new ArrayList<>();
    private String destino;
    private double precoBase;
    private Operadora operadora;

    public Pacote(String destino, double precoBase,List<String> passeios, Operadora operadora ) {
        this.destino = destino;
        this.precoBase = precoBase;
        this.passeios = passeios;
        this.operadora = operadora;
    }

    private Pacote(Pacote original) {
        this.destino = original.destino;
        this.precoBase = original.precoBase;
        this.passeios = new ArrayList<>(original.passeios);
        this.operadora = original.operadora;
    }

    @Override    
    public Pacote clonar(){
        return new Pacote(this);
    }

    public void setDestino(String destino){
        this.destino = destino;

    }

    public void setPrecobase(double precoBase){
        this.precoBase = precoBase;
    }

    

    public void setPasseios(List<String> passeios){
        this.passeios = passeios;
    }

    public void setOperadora(Operadora operadora){
        this.operadora = operadora;
    }

    public String getDestino(){
        return this.destino;
    }

    
    public double getPrecobase(){
        return this.precoBase;
    }

    public List<String> getPasseios(){
        return this.passeios;
    }

    public Operadora getOperadora(){
        return this.operadora;
    }
    
}
