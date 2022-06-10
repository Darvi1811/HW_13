package com.company.interfaces;

public class SmartPhone implements Caller, EmailSender, MailSender {

    @Override
    public void call(int number) {
        System.out.println("call: " + number);
    }

    @Override
    public String editMail(String mail) {
        System.out.println(mail);
        return mail;
    }

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
