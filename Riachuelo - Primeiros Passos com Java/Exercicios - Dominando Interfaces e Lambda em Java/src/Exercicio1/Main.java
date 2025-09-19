package Exercicio1;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        SendMessage sendMessage = null;
        while (true){
            System.out.println("Escolha a meio de envia da mensage: ");
            System.out.println("1-SMS");
            System.out.println("2-E-mail");
            System.out.println("3-Redes Sociais");
            System.out.println("4-WhatsApp");
            System.out.println("5-Sair do programa");
            option = scanner.nextInt();

            if (option == 1){
               sendMessage = sendMessageSms();
            } else if (option == 2) {
                sendMessage = sendMessageEmail();
            } else if (option == 3) {
                sendMessage = sendMessageSocialMedia();
            } else if (option == 4) {
                sendMessage = sendMessageWhatsApp();
            } else if (option == 5) {
                break;
            } else {
                System.out.println("Opção inválida");
                continue;
            }
            System.out.println(sendMessage.sendMessage());
        }
    }

    private static SendMessage sendMessageSms(){
        System.out.println("Escreva sua mensagem:");
        String message = scanner.next();
        return new SMS(message);
    }

    private static SendMessage sendMessageEmail(){
        System.out.println("Escreva sua mensagem:");
        String message = scanner.next();
        return new Email(message);
    }

    private static SendMessage sendMessageSocialMedia(){
        System.out.println("Escreva sua mensagem:");
        String message = scanner.next();
        return new SocialMedia(message);
    }

    private static SendMessage sendMessageWhatsApp(){
        System.out.println("Escreva sua mensagem:");
        String message = scanner.next();
        return new WhatsApp(message);
    }
}
