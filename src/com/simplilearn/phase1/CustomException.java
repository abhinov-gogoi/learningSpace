package phase1;

public class CustomException extends Exception{

    public CustomException(String message) {
        super(message);
    }

    public CustomException() throws Exception {
        throw new Exception("WHOA ! This is a new kind of Exception!!");
    }
}
