package Exercicio1;

public record WhatsApp(String message) implements SendMessage{
    @Override
    public String sendMessage() {
        return "Enviando mensagem por WhatsApp";
    }
}
