package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var carro = new Carro(false, 0,0);
        System.out.println("Controles do carro:\n" +
                "1-Ligar o carro\n" +
                "2-Desligar o carro\n" +
                "3-Acelerar\n" +
                "4-Desacelerar\n" +
                "5-Verificar Velociade\n" +
                "6-Trocar marcha\n");
        var opcoes = scanner.nextInt() ;

        switch (opcoes){
               case 1:
                   carro.ligarDesligar();
                   break;
               case 2:
                   carro.ligarDesligar();
               case 3:
                   carro.Acelerar();
               case 4:
                   carro.Desacelerar();
               case 5:
                   System.out.println(carro.getVelocidade());
               case 6:
                   System.out.println("Por favor informe a proxima marcha");
                   carro.setMarcha(scanner.nextInt());
        }
    }

}

