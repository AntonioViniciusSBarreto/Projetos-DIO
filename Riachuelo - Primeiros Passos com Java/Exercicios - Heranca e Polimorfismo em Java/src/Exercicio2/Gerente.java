package Exercicio2;

import java.util.Scanner;

public non-sealed class Gerente extends Usuario{

    public Gerente(String nome, String email, int senha) {
            this.nome = nome;
            this.email = email;
            this.senha = senha;
            this.admistrador = true;
    }

    public String gerarRelatorio(){
        String relatorio = "Relatorio Financiro";
        return relatorio;
    }

    public int consultarVendas(Vendedor vendedor){
        return vendedor.getQtdVendas();
    }

}
