/*
 * @Author Nilanjan Dasgupta
 */
package handsonexceptionhandling;
/*
 * Develop a simple java application to calculate the tax for a particular employee based on his salary.
Develop a class named “TaxCalculator“ with a method named calculateTax with the following method 
parameters,
Variable Name Data Type
empName String
isIndian boolean
empSal double
This method should return a double taxAmount.
The business logic for calculating the tax is as follows, this has to be implemented inside the 
method,
If the employee is not a Indian
 The calculator should throw a CountryNotValidException
If the employee name is null or empty
 The calculator should throw a EmployeeNameInvalidException
If empSal is greater than one lakh and isIndian true
taxAmount =empSal *8/100
Otherwise If empSal is between 50K and 1lakh and isIndian true
taxAmount =empSal *6/100 
Otherwise If empSal is between 30 and 50 Thousand and isIndian true
taxAmount =empSal *5/100 
Otherwise If empSal is between 10 and 30 Thousand and isIndian true
taxAmount =empSal *4/100 
Otherwise
 The calculator should throw a TaxNotEligibleException.
Develop a main class CalculatorSimulator , implement the following logic in main method
1. Execute the calculateTax Method and print the tax amount as “Tax amount is “<Tax Amount>
2. In case the calculateTaxMethod throws exceptions, this method needs to catch the appropriate 
exception print the stack trace and display the following messages,
a. Country not valid: “The employee should be an Indian citizen for calculating tax”
b. Employee name not valid: “The employee name cannot be empty”
c. Not eligible for Tax calculation: “The employee does not need to pay tax”
 */
import java.util.Scanner;
//class TaxCalculator
class TaxCalculator
{
	//method to calculate Tax
	public void calculateTax(String empName,boolean isindian,double empSal)
	{
		double taxamount;
		if(isindian==false)// if employee is not indian the throw an exception
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		else if(empName==null || empName.isEmpty())// if employee name is empty the throw an exception
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		//condition checking for calculating tax amount 
		else if(empSal>=100000&&isindian==true)
			taxamount=empSal*(double)8/(double)100;
		else if(empSal>=50000&&empSal<100000&&isindian==true)
			taxamount=empSal*(double)6/(double)100;
		else if(empSal>=30000&&empSal<50000&&isindian==true)
			taxamount=empSal*(double)5/(double)100;
		else if(empSal>=10000&&empSal<30000&&isindian==true)
			taxamount=empSal*(double)4/(double)100;
		else
			throw new TaxNotEligibleException("The employee does not need to pay tax");
	System.out.println("you have to pay "+taxamount+" amount tax");
	//System.out.println("Emp name: "+empName);
	}
	}
public class CalculatorSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name: ");
		String empName=sc.nextLine();
		System.out.println("Enter the Salary: ");
		double empsal=sc.nextDouble();
		System.out.println("Are you indian or not: ");
		boolean isindian=sc.nextBoolean();
		TaxCalculator tax=new TaxCalculator();
		//handle the exceptions
		try {
		tax.calculateTax(empName, isindian, empsal);
		}catch(CountryNotValidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameInvalidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e)
		{
			System.out.println(e.getMessage());
			
		}
		
		

	}

}
