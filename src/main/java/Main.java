import com.sun.source.tree.CaseTree;

import javax.swing.JOptionPane;
import java.util.*;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {
        String nome;
        String endereco;
        String telefone;
        Integer numeroid;
        Random geradorRand = new Random();
        String decisao;

        JOptionPane.showMessageDialog(null, "Bem vindo a nosso sitema de Banco!");
        boolean continua = true;
        List<Cliente> minhaListaCliente = new ArrayList<>();
        List<Conta> minhaListaconta= new ArrayList<>();
        int i=0;
        while (continua) {
            int option;
            option=Menus.MenuPrincipal();
            switch (option) {
                case 1:
                    nome = JOptionPane.showInputDialog("Digite o nome do Cliente a ser cadastrado:");
                    endereco=JOptionPane.showInputDialog("Digite o nome do Endereco a ser cadastrado");
                    telefone=JOptionPane.showInputDialog("Digite o telefone a ser cadastrado:");
                    numeroid = geradorRand.nextInt();
                    Cliente meuCLiente = new ClienteFisica(nome,endereco,telefone);
                    String conta =JOptionPane.showInputDialog("Deseja Cadastrar o cliente para uma Conta Poupanca ou Corrente?");
                    if(conta.contains("P")){
                        Conta minhaPoupanca = new ContaPoupanca(meuCLiente);
                        minhaListaCliente.add(meuCLiente);
                        minhaListaconta.add(minhaPoupanca);
                    }
                    else{
                        Conta minhaCorrente= new ContaCorrente(meuCLiente);
                        minhaListaCliente.add(meuCLiente);
                        minhaListaconta.add(minhaCorrente);
                    }
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Digite o nome do Cliente a ser cadastrado:");
                    endereco=JOptionPane.showInputDialog("Digite o nome do Endereco a ser cadastrado");
                    telefone=JOptionPane.showInputDialog("Digite o telefone a ser cadastrado:");
                    numeroid = geradorRand.nextInt();
                    Cliente meuCLiente2 = new ClienteCNPJ(nome,endereco,telefone);
                    String conta2 =JOptionPane.showInputDialog("Deseja Cadastrar o cliente para uma Conta Poupanca ou Corrente?");
                    if(conta2.contains("P")){
                        Conta minhaPoupanca2 = new ContaPoupanca(meuCLiente2);
                        minhaListaCliente.add(meuCLiente2);
                        minhaListaconta.add(minhaPoupanca2);
                    }
                    else{
                        Conta minhaCorrente2= new ContaCorrente(meuCLiente2);
                        minhaListaCliente.add(meuCLiente2);
                        minhaListaconta.add(minhaCorrente2);
                    }
                    break;
                case 3:
                    if(minhaListaconta.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Lista de Contas esta vazia!");
                    }
                    else{
                        for (Conta item : minhaListaconta) {
                            System.out.println(item.cliente);
//                            System.out.println(item.toString());
                        }
                    }
                    break;
                case 4:
                    String nomeprocurado = JOptionPane.showInputDialog("Digite o nome do Cliente para saber os dados:");
                    for(Conta item : minhaListaconta)
                    {
                        if(item.cliente.getNome().contains(nomeprocurado)){
                            JOptionPane.showMessageDialog(null,item.cliente.toString());
                        }
                    }
                    break;
                case 5:
                    String contaProcurada = JOptionPane.showInputDialog("Digite o nome do Cliente para acessar sua conta:");
                    for(Conta item : minhaListaconta)
                    {
                        if(item.cliente.getNome().contains(contaProcurada)){
                            String senha=JOptionPane.showInputDialog(null,"Digite a senha de administrador para acessar:");
                            if(senha.equals("12345678")){
                                while (continua){
                                    int opcao;
                                    opcao=Menus.MostraMenuCliente();
                                    switch (opcao){
                                        case 1:
                                            System.out.println(item.getSaldo());
                                            continua=decisao();
                                            break;
                                        case  2:
                                            item.cliente.imprimirCliente();
                                            item.imprimirExtrato();
                                            continua=decisao();
                                            break;
                                        case 0:
                                            continua=false;
                                            break;
                                        default:break;
                                    }
                                }
                            }
                            else JOptionPane.showMessageDialog(null,"ACESSO NEGADO!");
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    break;
            }
            String termo = JOptionPane.showInputDialog("Deseja Sair do Programa?");
            if (termo.contains("n") || termo.contains("N")) {
                continua = true;
            } else continua = false;
        }
//        continua=false;
    }
    public static boolean decisao(){
        String decisao=JOptionPane.showInputDialog(null,"Deseja realizar outra operacao?");
        if(decisao.contains("S")||decisao.contains("s")){
            return true;
        }
        else return false;
    }
}

