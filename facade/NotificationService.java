package facade;

public class NotificationService {
    public void send(String message, String target){
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect();
        AuthToken authToken = server.authenticate("11op23", "huk89(*HUi");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
