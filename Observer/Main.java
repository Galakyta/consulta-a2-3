package Observer;

public class Main {

    public static void main(String[] args) {
        Observer vendas = new Vendas();
        Observer compras = new Compras();
        Observer auditoria = new Auditoria();

        
        Produto geladeira = new Produto("Geladeira",10);
        
        geladeira.inscrever(compras);
        geladeira.inscrever(vendas);
        geladeira.inscrever(auditoria);

        
        geladeira.setEstoque(2);
        geladeira.setEstoque(2);
    }

}
