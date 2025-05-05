package Q03;

import Q03.util.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe os dados do Produto: \n");

        System.out.print("Código: ");
        int code = scan.nextInt();

        System.out.print("Nome: ");
        String name = scan.next();

        System.out.print("Preço: ");
        double price = scan.nextDouble();

        do {
            System.out.print("Informe um preço válido: ");
            price = scan.nextDouble();
        }
        while(price < 0);

        System.out.print("Estoque: ");
        int stock = scan.nextInt();

        Produto produto = new Produto(code, name, price, stock);

        System.out.println("\nInformando os dados: \n");

        produto.exibirInfo();


    }
}