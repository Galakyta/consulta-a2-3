package Observer;

public interface Subject {
    public void inscrever(Observer observer);
    public void desinscrever(Observer observer);
    public void pingarObservers();
}
//subject mesma coisa, so copiar e colar pq ele so vai delimitar como os observer