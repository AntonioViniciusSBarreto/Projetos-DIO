import java.math.BigDecimal;
import java.util.Scanner;

public class Desafio1 {
    // Desafio 1
    /*
    Na loja de departamentos "SuperCompras", o gerente
    decidiu fazer uma promoção especial.Dependendo do valor
    da compra, os clientes receberão diferentes descontos.
    Sua missão é implementar um programa que determine
    o desconto aplicado com base no valor gasto!
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorCompra = scanner.nextLine();
        System.out.println(calcularDesconto(valorCompra));
        scanner.close();
    }

    public static String calcularDesconto(String valorCompra) {
        BigDecimal valor = new BigDecimal(valorCompra);
        BigDecimal descontoPercentual;
        BigDecimal valorMinimo1 = new BigDecimal("50.00");
        BigDecimal valorMinimo2 = new BigDecimal("100.00");
        var message = "";


        if (valor.compareTo(valorMinimo1) == -1){
            message = "Desconto de 0%";
        }else if (valor.compareTo(valorMinimo1) == 1 && valor.compareTo(valorMinimo2) == -1){
            message = "Desconto de 10%";
        } else {
            message = "Desconto de 20%";
        }
        return message;
    }
}
