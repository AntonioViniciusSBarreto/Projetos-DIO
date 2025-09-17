package Exercicio2;

public non-sealed class Atendente extends Usuario{

    protected int qtdCaixa;

    public int getQtdCaixa() {
        return qtdCaixa;
    }

    public void setQtdCaixa(int qtdCaixa) {
        this.qtdCaixa = qtdCaixa;
    }

    public Atendente(String nome, String email, int senha,int qtdCaixa) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admistrador = false;
        this.qtdCaixa = qtdCaixa;
    }

    public void realizarPagementos(int pagamentos){
        this.qtdCaixa += pagamentos;
    }

    public String fecharCaixa(){
        return "Caixa Fechado";
    }
}
