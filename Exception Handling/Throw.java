package exceptionhandling;

import java.io.IOException;

public class Throw {
	static void validateAge(int age) throws AgeValidationException
	{
		
		//try {
		if (age<18)
			throw new AgeValidationException ("Age is not valid for vote");
		else
			System.out.println("age is valid");
	/*}catch(AgeValidationException e)
	{
		System.out.println(e.getMessage());
	}*/
	
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		validateAge(29);
		}catch(AgeValidationException e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}

