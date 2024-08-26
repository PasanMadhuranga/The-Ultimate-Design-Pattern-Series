package chainOfResponsibility;

public class Authenticator extends Handler{


    protected Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        boolean isValid = (request.getUsername() == "Pasan" && request.getPassword() == "12345");
        if (isValid){
            System.out.println("Authenticate successfully");
            return false;
        }
        System.out.println("Authentication failed");
        return true;
    }
}
