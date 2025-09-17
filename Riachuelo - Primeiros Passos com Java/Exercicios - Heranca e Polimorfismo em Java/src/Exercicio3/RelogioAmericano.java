package Exercicio3;

public non-sealed class RelogioAmericano extends Relogio{

    private String indicadorPeriodo;

    public String getIndicadorPeriodo() {
        return indicadorPeriodo;
    }

    public void setAntesDoMeioDia(){
        this.indicadorPeriodo = "AM";
    }

    public void setDepoisDoMeioDia(){
        this.indicadorPeriodo = "PM";
    }

    public void setHora(int hora) {
        setAntesDoMeioDia();
       if ((hora > 12) && (hora <= 23)){
           setDepoisDoMeioDia();
           this.hora = hora - 12;
       } else if (hora>=24) {
           this.hora= 0;
       }else {
           this.hora= hora;
       }
    }

    @Override
    Relogio convercao(Relogio relogio) {
        this.segundo = relogio.getSegundo();
        this.minuto = relogio.getMinuto();

        switch (relogio){
            case RelogioAmericano relogioAmericano -> {
                this.hora = relogioAmericano.getHora();
                this.indicadorPeriodo = relogioAmericano.getIndicadorPeriodo();
            }

            case RelogioBrasileiro relogioBrasileiro -> this.setHora(relogioBrasileiro.getHora());
        }
        return this;
    }

    @Override
    public String getHorario(){
        return super.getHorario() + " " + this.indicadorPeriodo;
    }
}
