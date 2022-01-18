import javax.swing.*;
public class Menus {
    public static byte MenuPrincipal() {
        byte option;
        option = Byte.parseByte(JOptionPane.showInputDialog(null,
                "Menu Principal \n"
                        + "1 -> Cadastrar Cliente Fisico\n"
                        + "2 -> Cadastrar Cliente Juridido\n"
                        + "3 -> Imprimir Todos os Clientes \n"
                        + " 4 -> Imprimir Determinado Cliente\n"
                        + " 5 -> Acessar Conta Cliente\n"
                        + "0 -> Encerrar Programa\n"));
        return option;
    }
    public static byte MostraMenuCliente(){
        byte escolha;
        escolha=Byte.parseByte(JOptionPane.showInputDialog(null,"Menu Principal \n"
                + "1 -> Imprimir Saldo\n"
                + "2 -> Imprimir Dados Geral\n"
                + "0 -> Encerrar Programa\n"));
        return escolha;
    }
}
