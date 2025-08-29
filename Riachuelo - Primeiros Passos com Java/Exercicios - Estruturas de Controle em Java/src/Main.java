import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Exércicio 1
        var scanner = new Scanner(System.in);
        System.out.println("Digite o número qual deseja saber a tabuada: ");
        var num = scanner.nextInt();

        for (var i = 0;i <= 10;i++){
            System.out.printf(num + "x" + i + "=" + num*i +"\n");
        }*/
        /*Exércicio 2
        *
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu peso:");
        var peso = scanner.nextFloat();
        System.out.println("Agora informe a sua altura:");
        var altura = scanner.nextFloat();
        float imc = peso /(altura*altura);
        System.out.println(imc);
        if(imc<=18.5){
            System.out.println("Você está: Abaixo do Peso");
        } else if (imc>=18.6 && imc<=24.9) {
            System.out.println("Você está: Peso Ideal");
        } else if (imc>=25.0 && imc<=29.9) {
            System.out.println("Você está: Levemente acima do peso");
        } else if (imc>=30.0 && imc<=34.9) {
            System.out.println("Você está: Obsesidade Grau I");
        }else if (imc>=35.0 && imc<=39.9) {
            System.out.println("Você está: Obsesidade Grau II(Severa)");
        }else if (imc<=40.0) {
            System.out.println("Você está: Obsesidade Grau III(Morbida)");
        }*/
        /*Exécicio 3
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        var primeiroNum = scanner.nextInt();
        System.out.println("Informe outro número:");
        var segundoNum = scanner.nextInt();
        if (segundoNum < primeiroNum){
            System.out.println("Informe outro número que seja maior que o anterior:");
            segundoNum = scanner.nextInt();
        }

        System.out.println("Gostaria de saber os números pares ou impares entres estes números?(i/p):");
        var imparOuPar = scanner.next();

        switch (imparOuPar){
            case "i":
                while(segundoNum >= primeiroNum){
                    var resultNum = segundoNum % 2;
                    var compNum = resultNum == 0;
                    if (!compNum){
                        System.out.println(segundoNum);
                    }
                    segundoNum = segundoNum -1;
            }
            case "p":
                while(segundoNum >= primeiroNum){
                    var resultNum = segundoNum % 2;
                    var compNum = resultNum == 0;
                    if (compNum){
                        System.out.println(segundoNum);
                    }
                    segundoNum = segundoNum -1;
                }
        }*/

        var scanner = new Scanner(System.in);
        System.out.println("Informe um número:");
        var primNum = scanner.nextInt();
        System.out.println("Informe outro número:");
        var segNum = scanner.nextInt();

        while(primNum % segNum != 0){
            System.out.println("Informe outro número:");
            segNum = scanner.nextInt();
        }
    }
}
