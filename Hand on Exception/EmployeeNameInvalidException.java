package handsonexceptionhandling;

public class EmployeeNameInvalidException extends RuntimeException {
	public EmployeeNameInvalidException(String message)
	{
		super(message);
	}


}
