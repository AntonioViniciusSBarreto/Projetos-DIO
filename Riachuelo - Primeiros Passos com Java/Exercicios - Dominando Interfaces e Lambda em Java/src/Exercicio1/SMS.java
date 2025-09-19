package Exercicio1;

public record SMS(String message) implements SendMessage {
    @Override
    public String sendMessage() {
        return "Enviando mensagem por SMS";
    }
}
