package Exercicio2;

public abstract sealed class Usuario permits Atendente, Gerente, Vendedor {
    protected String nome;

    protected String email;

    protected int senha;

    protected boolean admistrador;

    public boolean isAdmistrador() {
        return admistrador;
    }

    public void setAdmistrador(boolean admistrador) {
        this.admistrador = admistrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String fazerLogin(){
        return "Fez login";
    }

    public String fazerLogoff(){
        return "Fez logoff";
    }

    public void alterarSenha(int novaSenha){
        this.senha = novaSenha;
    }

    public void alterarDados(String novoNome, String novoEmail){
        this.nome = novoNome;
        this.email = novoEmail;
    }
}
