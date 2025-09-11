package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var novaConta = new ContaBancaria("Antonio", 2100.00F);
        var scanner = new Scanner(System.in);
        System.out.println("Escolha uma das opções abaixo \n" +
                "1 - Deposito \n" +
                "2 - Saque \n" +
                "3 - Pagar um Boleto \n" +
                "4 - Verificar cheque especial \n" +
                "5 - Consultar saldo \n");
        var opcaoEscolhida = scanner.nextInt();

        switch (opcaoEscolhida){
            case 1:
                System.out.println("Digite o valor a ser depositado: ");
                var valorDepositado = scanner.nextFloat();
                novaConta.Depoisito(valorDepositado);
                break;
            case 2:
                System.out.println("Digite o valor a ser sacado: ");
                var valorSacado = scanner.nextFloat();
                novaConta.Saque(valorSacado);
                break;
            case 3:
                System.out.println("Digite o valor do boleto a ser pago: ");
                var valorBoleto = scanner.nextFloat();
                if (valorBoleto > novaConta.getSaldoConta()){
                    novaConta.setSaldoConta(novaConta.getChequeEspecial() + novaConta.getSaldoConta());
                    novaConta.PagamentoBoletos(valorBoleto);
                    novaConta.setChequeEspecial(novaConta.getSaldoConta());
                    novaConta.setSaldoConta(novaConta.getSaldoConta() - novaConta.getChequeEspecial());
                }else{
                    novaConta.PagamentoBoletos(valorBoleto);
                }
                break;
            case 4:
                System.out.println(novaConta.getChequeEspecial());
                break;
            case 5:
                System.out.println(novaConta.getSaldoConta());
                break;
        }
    }
}
