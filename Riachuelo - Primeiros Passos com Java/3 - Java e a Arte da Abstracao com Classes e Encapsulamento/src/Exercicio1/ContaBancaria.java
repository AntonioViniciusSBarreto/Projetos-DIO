package Exercicio1;

public class ContaBancaria {

    private String nomeConta;

    private float saldoConta;

    private double chequeEspecial;

    public String getNomeConta() {
        return nomeConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setNomeConta(String nomeConta) {
        this.nomeConta = nomeConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }
     public ContaBancaria(String nomeConta, float saldoConta){
        this.nomeConta = nomeConta;
        this.saldoConta = saldoConta;
        if (saldoConta > 500.00){
            this.chequeEspecial = saldoConta / 2;
            return;
        }
        this.chequeEspecial = 50.00F;
     }

    public float getChequeEspecial() {
        return (float) chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void Depoisito(float valor){
        float novoSaldoConta = this.saldoConta + valor;
        System.out.printf("Valor depositado. Novo Saldo: " + novoSaldoConta);
    }

    public void Saque(float valor){
        saldoConta -=valor;
        System.out.println("Valor sacado");
    }
    public void PagamentoBoletos(float valor){
        saldoConta -=valor;
        System.out.println("Boleto pago");
    }


}
