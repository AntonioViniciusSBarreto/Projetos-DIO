package Exercicio1;

public non-sealed class IngressoFamilia extends Ingresso{

    @Override
    double convesaoValor() {
        if (tamanhoFamilia > 3){
            valor = (valor * tamanhoFamilia) - (valor * 0.05);
        }else{
            valor *= tamanhoFamilia;
        }
        return valor;
    }
}
