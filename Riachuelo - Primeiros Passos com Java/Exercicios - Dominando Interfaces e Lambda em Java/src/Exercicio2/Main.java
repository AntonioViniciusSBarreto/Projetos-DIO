package Exercicio2;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        Produto produto = null;

        while (true){
            System.out.println("Informe o tipo do seu produto:");
            System.out.println("1-Alimento");
            System.out.println("2-Saúde e bem estar");
            System.out.println("3-Vestuário");
            System.out.println("4-Cultura");
            System.out.println("5-Sair do programa");
            option = scanner.nextInt();

            if (option == 1){
                produto = produtoAlimentacao();
            } else if (option == 2) {
                produto = produtoSaudeBemEstar();
            } else if (option == 3) {
                produto = produtoVestuario();
            } else if (option == 4) {
                produto = produtoCultura();
            } else if (option == 5) {
                break;
            } else {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println("O preço final do item é:" + produto.ValorImposto());
        }
    }

    private static Produto produtoAlimentacao(){
        System.out.println("Informe o preço do produto:");
        double preco = scanner.nextDouble();
        return new Alimento(preco);
    }

    private static Produto produtoSaudeBemEstar(){
        System.out.println("Informe o preço do produto:");
        double preco = scanner.nextDouble();
        return new SaudeBemEstar(preco);
    }

    private static Produto produtoVestuario(){
        System.out.println("Informe o preço do produto:");
        double preco = scanner.nextDouble();
        return new Vestuario(preco);
    }

    private static Produto produtoCultura(){
        System.out.println("Informe o preço do produto:");
        double preco = scanner.nextDouble();
        return new Cultura(preco);
    }
}