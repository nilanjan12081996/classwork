package exceptionhandling;
//unchecked exception
/*public class AgeValidationException extends RuntimeException{
	public AgeValidationException(String message)
	{
		super(message);
	}

}*/
//checked exception
public class AgeValidationException extends Exception{
	public AgeValidationException(String message)
	{
		super(message);
	}
}
