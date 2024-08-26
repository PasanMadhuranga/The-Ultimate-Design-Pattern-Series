package chainOfResponsibility;


public class Main {
    public static void main(String[] args){
        // authenticator -> logger -> compressor
        Compressor compressor = new Compressor(null);
        Logger logger = new Logger(compressor);
        Authenticator authenticator = new Authenticator(logger);

        Webserver server = new Webserver(authenticator);
        server.handle(new HttpRequest("Pasan", "12345"));
    }
}
