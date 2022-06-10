package com.company.interfaces;

public class Post implements MailSender {
    @Override
    public String createMail(String mail) {
        System.out.println(mail);
        return mail;
    }

    @Override
    public void sendMail(String mail) {
        System.out.println("sendMail");
    }
}
