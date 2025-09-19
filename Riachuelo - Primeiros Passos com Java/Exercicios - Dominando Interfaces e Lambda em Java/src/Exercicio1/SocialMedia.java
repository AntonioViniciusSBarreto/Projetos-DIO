package Exercicio1;

public record SocialMedia(String message) implements SendMessage{
    @Override
    public String sendMessage() {
        return "Enviando mensagem pelas redes sociais";
    }
}
