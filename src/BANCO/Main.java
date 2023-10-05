package BANCO;

// Elabore um programa que simule um sistema bancario de um cliente. Inicialmente o saldo está zerado, mas o cliente pode escolher qualquer uma das seguintes opçoes do menu:
// - Consultar saldo
// - Depositar
// -Sacar
// - transferir

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor a depositar: ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor a sacar: ");
                    double valorSaque = sc.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    // Para simplificar, vamos assumir que a transferência será para a mesma conta
                    System.out.print("Digite o valor a transferir: ");
                    double valorTransferencia = sc.nextDouble();
                    conta.transferir(conta, valorTransferencia);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
