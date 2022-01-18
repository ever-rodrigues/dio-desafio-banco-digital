
public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO=1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia=Conta.AGENCIA_PADRAO;
        this.numeroConta=SEQUENCIAL++;
        this.cliente=cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo=saldo-valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo+=valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }

    protected void imprimirDetalhes() {
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Conta: %d",this.numeroConta));
        System.out.println(String.format("Saldo = %.2f",this.saldo));
        System.out.println(String.format("Cliente %S",this.cliente.getNome()));
        System.out.println(String.format("Id %d",this.cliente.getId()));

    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
