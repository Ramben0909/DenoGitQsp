package Test;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	private String msg; 
    public InvalidAgeException(String message) {
        this.msg = message;
    }
    public String getMessage() {
    	return "Caught Custom Exception: " +msg;
    }
}

public class Custom {
	    public static void main(String[] args) {
	        try {
	            validateUser(15);
	        } catch (InvalidAgeException e) {
	            System.out.println( e.getMessage());
	        } finally {
	            System.out.println("This always runs (cleanup).");
	        }
	    }

	    // Use 'throws' to declare a Checked Exception
	    public static void validateUser(int age) throws InvalidAgeException {
	        if (age < 18) {
	            // Throwing our custom checked exception
	            throw new InvalidAgeException("Age must be 18+ to register.");
	        }
	        
	    }
}
