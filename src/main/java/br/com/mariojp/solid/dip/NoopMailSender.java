package br.com.mariojp.solid.dip;

public class NoopMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("DRY RUN: Email para " + to + " não foi enviado de verdade.");
        System.out.println("Assunto: " + subject);
        System.out.println("Corpo: " + body);
    }
}