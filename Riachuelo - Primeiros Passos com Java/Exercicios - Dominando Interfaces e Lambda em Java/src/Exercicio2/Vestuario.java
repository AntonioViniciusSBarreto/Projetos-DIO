package Exercicio2;

public record Vestuario(double valor) implements Produto {
    @Override
    public double ValorImposto() {
        return valor + (valor * 0.025);
    }
}
