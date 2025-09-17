package Exercicio1;

public sealed abstract class Ingresso permits MeiaEntrada,IngressoFamilia{

    protected double valor;

    protected String nomeDoFilme;

    protected String dubladoLegendado;

    protected int tamanhoFamilia;

    public int getTamanhoFamilia() {
        return tamanhoFamilia;
    }

    public void setTamanhoFamilia(int tamanhoFamilia) {
        this.tamanhoFamilia = tamanhoFamilia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public String getDubladoLegendado() {
        return dubladoLegendado;
    }

    public void setDubladoLegendado(String dubladoLegendado) {
        this.dubladoLegendado = dubladoLegendado;
    }

    abstract double convesaoValor();
}
