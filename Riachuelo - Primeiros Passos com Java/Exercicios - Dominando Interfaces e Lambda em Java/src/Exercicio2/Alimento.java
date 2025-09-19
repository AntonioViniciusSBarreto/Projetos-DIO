package Exercicio2;

public record Alimento(double valor) implements Produto {
    @Override
    public double ValorImposto() {
        return valor + (valor * 0.01);
    }
}
