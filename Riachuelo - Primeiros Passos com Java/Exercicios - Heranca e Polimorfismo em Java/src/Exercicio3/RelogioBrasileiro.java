package Exercicio3;

public non-sealed class RelogioBrasileiro extends Relogio{

    @Override
    public Relogio convercao(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();

        switch (relogio){
            case RelogioAmericano relogioAmericano -> this.hora = (relogioAmericano.getIndicadorPeriodo().equals("PM"))
                                                       ? relogioAmericano.getHora() + 12 : relogioAmericano.getHora();

            case RelogioBrasileiro relogioBrasileiro -> this.hora = relogioBrasileiro.getHora();
        }
        return this;
    }
}
