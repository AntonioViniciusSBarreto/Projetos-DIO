import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
//Desafio 2
/*
        Você é o novo gerente de uma rede de lojas de
        departamento e precisa organizar o estoque de
        produtos. Cada loja possui um código único e
        você deve calcular o total de produtos disponíveis
        em cada uma delas. Aceite o desafio e ajude a empresa
        a otimizar seu estoque!
*/

public class Desafio2 {
    public static void main(String[] args) {Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        String saida = organizarEstoque(entrada);

        System.out.println(saida);

        scanner.close();
    }

    public static String organizarEstoque(String entrada) {

        Map<String, Integer> estoquePorLoja = new LinkedHashMap<>();


        String[] lojas = entrada.split(",");


        for (String loja : lojas) {
            String[] partes = loja.split(":");
            String codigo = partes[0].trim();
            int quantidade = Integer.parseInt(partes[1].trim());



            estoquePorLoja.put(codigo, estoquePorLoja.getOrDefault(codigo, 0) + quantidade);
        }


        StringBuilder sb = new StringBuilder();



        for (Map.Entry<String, Integer> entry : estoquePorLoja.entrySet()) {
            sb.append(entry.getKey()).append(":").append(entry.getValue()).append(",");
        }



        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }


        return sb.toString();
    }
    }
}
