package adapter.exercise;

import adapter.exercise.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider{
    private GmailClient gmailClient = new GmailClient();

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
