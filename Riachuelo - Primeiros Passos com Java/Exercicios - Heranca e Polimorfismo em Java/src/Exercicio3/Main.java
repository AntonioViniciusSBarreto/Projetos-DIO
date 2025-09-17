package Exercicio3;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new RelogioBrasileiro();
        relogio.setSegundo(0);
        relogio.setMinuto(0);
        relogio.setHora(24);

        System.out.println(relogio.getHorario());

        System.out.println(new RelogioAmericano().convercao(relogio).getHorario());
    }
}
