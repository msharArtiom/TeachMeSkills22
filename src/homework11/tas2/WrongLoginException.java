package homework11.tas2;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException() {
        super();

    }

    public WrongLoginException(String message) {
        super(message);
        System.out.println("The login must not be more than 20 characters and must not contain spaces" );
    }
}
