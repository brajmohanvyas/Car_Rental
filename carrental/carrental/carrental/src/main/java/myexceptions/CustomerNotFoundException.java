package myexceptions;

public class CustomerNotFoundException extends RuntimeException{
	public CustomerNotFoundException(String message) {
        super(message);
    }
}