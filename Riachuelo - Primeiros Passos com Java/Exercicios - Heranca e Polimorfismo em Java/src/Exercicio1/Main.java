package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ingresso ingresso = new IngressoFamilia();
        Ingresso ingressoMeiaEntrada = new MeiaEntrada();
        ingressoMeiaEntrada.setValor(30);
        ingresso.setNomeDoFilme("Spaceballs");
        ingresso.setDubladoLegendado("Legendado");
        ingresso.setValor(30);
        ingresso.setTamanhoFamilia(4);


        System.out.printf("Nome do filme: %s \n ",ingresso.getNomeDoFilme());
        System.out.printf(ingresso.getDubladoLegendado() + "\n");
        System.out.printf("Valor inteiro do ingresso:%s \n",ingresso.getValor());
        System.out.printf("Valor familia do ingresso: %s \n",ingresso.convesaoValor());
        System.out.printf("Meia-Entrada: %s \n",ingressoMeiaEntrada.convesaoValor());

    }
}
