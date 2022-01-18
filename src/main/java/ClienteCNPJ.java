public class ClienteCNPJ extends Cliente{
    public  ClienteCNPJ(){
        super();
    }
    public ClienteCNPJ(String nome, String endereco, String telefone) {
        super(nome, endereco, telefone);
    }
    @Override
    public void imprimirCliente() {
        System.out.println("==== Cliente Pessoa Juridica ====");
        super.imprimirDetalhes();
    }
}
