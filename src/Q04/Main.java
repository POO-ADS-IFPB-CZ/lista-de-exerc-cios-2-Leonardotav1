package Q04;

import Q04.util.ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os dados da conta bancária");

        System.out.print("Número: ");
        int num = scan.nextInt();

        System.out.print("Titular: ");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.print("Saldo: ");
        float balance = scan.nextFloat();

        ContaCorrente contaCorrente = new ContaCorrente(num, name, balance);

        //Menu em loop
        int select;
        do {
            System.out.println("\n[1] Sacar Valor");
            System.out.println("[2] Depositar um Valor");
            System.out.println("[3] Consultar Saldo");
            System.out.println("[0] Sair do programa\n");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Informe o valor a ser sacado: ");
                    float saque = scan.nextFloat();
                    contaCorrente.sacar(saque);
                    System.out.println("Saque feito com sucesso!");
                    break;

                case 2:
                    System.out.println("Informe o valor a ser depositado: ");
                    float valorDep = scan.nextFloat();
                    contaCorrente.depositar(valorDep);
                    System.out.println("Depósito feito com sucesso!");
                    break;

                case 3:
                    System.out.println("Saldo disponível: ");
                    System.out.println(contaCorrente.consultarSaldo());
                    break;

                case 0:
                    System.out.println("Saindo...");

            }
        }
        while (select != 0);
    }
}