package Exercicio1;

public record Email(String message) implements SendMessage {
    @Override
    public String sendMessage() {
        return "Enviando mensagem por email";
    }
}
