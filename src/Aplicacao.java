import entidades.Cliente;
import entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        System.out.println("Por favor, informe os dados solicitados: ");

        System.out.print("Número da conta: ");
        String numero = sc.next();

        System.out.print("Agência: ");
        String agencia = sc.next();
        sc.nextLine();

        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Saldo: ");
        Double saldo = Double.parseDouble(sc.next());

        conta = new Conta(numero, agencia, new Cliente(nome, "9999-9999"), true);

        conta.depositar(saldo);

        System.out.println("Dados da conta:");

        System.out.println(conta);

        sc.close();
    }

}