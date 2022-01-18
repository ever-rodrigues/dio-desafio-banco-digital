public class ClienteFisica extends Cliente{
    public  ClienteFisica(){
        super();
    }
    public ClienteFisica(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    @Override
    public void imprimirCliente() {
        System.out.println("==== Cliente Pessoa Fisica ====");
        super.imprimirDetalhes();
    }
}
