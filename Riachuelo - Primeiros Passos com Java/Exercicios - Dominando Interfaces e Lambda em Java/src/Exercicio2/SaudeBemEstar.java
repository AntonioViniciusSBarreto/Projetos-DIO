package Exercicio2;

public record SaudeBemEstar(double valor) implements Produto {
    @Override
    public double ValorImposto() {
        return valor + (valor * 0.015);
    }
}
