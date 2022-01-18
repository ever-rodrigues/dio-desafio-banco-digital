import javax.swing.*;
import java.util.Random;

public class Cliente {
    private  String nome;
    private  String endereco;
    private  String telefone;
    private int numeroid;
    Random geradorRand = new Random();

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroid = geradorRand.nextInt();
        this.telefone = telefone;
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return numeroid;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    protected void imprimirCliente(){
        System.out.println(this.getId());
        System.out.println(String.format("Nome: %s",this.getNome()));
        System.out.println(String.format("Endereco: %s",this.getEndereco()));
        System.out.println(String.format("Telefone: %s",this.getTelefone()));
    }


    protected void imprimirDetalhes(){
        System.out.println(String.format("Nome: %s",this.getNome()));
        System.out.println(String.format("Endereco: %s",this.getEndereco()));
        System.out.println(String.format("Telefone: %s",this.getTelefone()));
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", numeroid=" + numeroid +
                '}';
    }


}
