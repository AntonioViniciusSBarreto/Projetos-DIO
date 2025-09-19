package Exercicio2;

public record Cultura(double valor) implements Produto {
    @Override
    public double ValorImposto() {
        return valor + (valor * 0.04);
    }
}
