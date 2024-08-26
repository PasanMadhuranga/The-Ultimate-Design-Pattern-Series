package adapter.exercise;

import adapter.exercise.Gmail.GmailClient;

public class Main {
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();
        emailClient.addProvider(new GmailAdapter());
        emailClient.downloadEmails();
    }
}
