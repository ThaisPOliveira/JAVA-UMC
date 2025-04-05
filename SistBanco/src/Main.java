import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("BEM VINDO AO BANCO OLI!\n");

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titularConta = scanner.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoConta = scanner.nextDouble();


        Conta conta = new Conta(numeroConta, titularConta, saldoConta);

        System.out.println("Conta criada com sucesso! Saldo inicial: " + conta.getSaldo());

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu de operações:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma operação: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Operação de depósito
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    // Operação de saque
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    // Consultar saldo
                    System.out.println("Saldo atual: " + conta.getSaldo());
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Obrigado por usar nosso sistema bancário!");
                    break;
            }
        }

        scanner.close();
    }
}
//        boolean continuar = true;
//        while (continuar) {
//            System.out.println("\nMenu de operações:");
//            System.out.println("1 - Depositar");
//            System.out.println("2 - Sacar");
//            System.out.println("3 - Consultar Saldo");
//            System.out.println("4 - Sair");
//            System.out.print("Escolha uma operação: ");
//
//            String operacao = scanner.nextLine();
//
//            switch (operacao) {
//                case "1": {
//                    System.out.println("Digite o valor que deseja depositar");
//                    double deposito = scanner.nextDouble();
//                    conta.depositar(deposito);
//                    break;
//                }
//                case "2": {
//                    System.out.println("Digite o valor que deseja sacaar");
//                    double sacar = scanner.nextDouble();
//                    conta.sacar(sacar);
//                    break;
//                }
//                case "3": {
//                    System.out.println("Saldo atual: " + conta.getSaldo());
//                    break;
//                }
//                case "4": {
//                    System.out.println("Obrigado por usar nosso sistema bancário!");
//                    continuar = false;
//                    break;
//                }
//
//            }
//            scanner.close();
//        }
//}