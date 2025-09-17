package Exercicio2;

public non-sealed class Vendedor extends Usuario{

    protected int qtdVendas;

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Vendedor(String nome, String email, int senha, int qtdVendas) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admistrador = false;
        this.qtdVendas = qtdVendas;
    }

    public void realizarVendas(int vendas){
        this.qtdVendas = getQtdVendas() + vendas;
    }

    public int consultarVendas(){
        return this.getQtdVendas();
    }
}
