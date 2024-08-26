package chainOfResponsibility;

public class Webserver {
    private Handler handler;

    public Webserver(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest request){
        handler.handle(request);
    }
}
