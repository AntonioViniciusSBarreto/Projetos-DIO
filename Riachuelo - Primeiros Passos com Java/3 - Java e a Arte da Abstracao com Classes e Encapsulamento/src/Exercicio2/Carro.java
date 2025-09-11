package Exercicio2;

import java.util.Objects;
import java.util.Scanner;

public class Carro {
    private boolean ligado;

    private int velocidade;

    private String direcao;

    private int marcha;

    public int getMarcha() {
        return marcha;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Carro(boolean ligado, int marcha,int velocidade){
        this.ligado = ligado;
        this.marcha = marcha;
        this.velocidade = velocidade;
    }

    public boolean ligarDesligar(){
        var scanner = new Scanner(System.in);
        if (this.ligado){
            System.out.println("Deseja desligar o carro?(s/n)");
            var resposta = scanner.next();
            this.ligado = Objects.equals(resposta, "s") ? false : true;
            System.out.println("Carro desligado");

        }else{
            System.out.println("Deseja ligar o carro?(s/n)");
            var resposta = scanner.next();
            this.ligado = Objects.equals(resposta, "s") ? true : false;
            System.out.println("Carro ligado");

        }
        return this.ligado;
    }

    public void Acelerar(){
        var scanner = new Scanner(System.in);
        var resposta = 0;
        this.velocidade += 1;
        while (this.velocidade < 120){
           System.out.println("Deseja continuar a acelerar?(1 para sim, 0 para não)");
           resposta = scanner.nextInt();
           if (resposta == 1){
               this.velocidade += 1;
               marcha(this.marcha);
           }else {
               break;
           }
       }
    }

    public void Desacelerar(){
        var scanner = new Scanner(System.in);
        var resposta = 0;
        this.velocidade -= 1;
        while (this.velocidade > 0){
            System.out.println("Deseja continuar a desacelerar?(1 para sim, 0 para não)");
            resposta = scanner.nextInt();
            if (resposta == 1){
                this.velocidade -= 1;
                marcha(this.marcha);
            }else {
                break;
            }
        }
    }

    public int marcha(int novaMarcha){
        this.marcha = novaMarcha;
        var scanner = new Scanner(System.in);
        if (this.marcha == 0){
            System.out.println("Por favor retirar o veículo do ponto morto");
            this.marcha = scanner.nextInt();
        }
        switch (this.marcha){
            case 1:
                if (velocidade > 20) {
                    System.out.println("Por favor diminuir a marcha");
                    this.marcha = scanner.nextInt();
                    break;
                }
            case 2:
                if (velocidade > 21 && velocidade >40) {
                    System.out.println("Por favor aumentar a marcha");
                    this.marcha = scanner.nextInt();
                    break;
                }
            case 3:
                if (velocidade > 41 && velocidade > 60) {
                    System.out.println("Por favor diminuir a marcha");
                    this.marcha = scanner.nextInt();
                    break;
                }
            case 4:
                if (velocidade > 61 && velocidade > 80) {
                    System.out.println("Por favor diminuir a marcha");
                    this.marcha = scanner.nextInt();
                }
            case 5:
                if (velocidade > 81 && velocidade > 100) {
                    System.out.println("Por favor diminuir a marcha");
                    this.marcha = scanner.nextInt();
                }
            case 6:
                if (velocidade > 101 && velocidade > 120) {
                    System.out.println("Por favor diminuir a marcha");
                    this.marcha = scanner.nextInt();
                }
        }
        return marcha;
    }
}
