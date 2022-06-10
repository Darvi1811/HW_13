package com.company.interfaces;

public class Main {
    public static void lol(MailSender[] args) {
        for (MailSender object:
             args) {
            object.createMail("fadfa");
            object.sendMail("fadfa");
        }
    }
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call(25233);
        smartPhone.editMail("gfsgdf");

        DialPhone dialPhone = new DialPhone();
        dialPhone.call(35234);

        Post post = new Post();
        post.createMail("fdagsgs");
        post.sendMail("fdagsgs");

        lol(new MailSender[] {smartPhone, post});
    }
}
