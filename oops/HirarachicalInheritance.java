package oops;
//parent class
class Bank{
	public void loanInterest()
	{
		System.out.println("9% interest");
	}
}
//Sbi is subclass which inherit parentclass Bank 
class Sbi extends Bank
{
	public void sbiLoan() {//sbiLoan Method
		System.out.println("For SBI");
	}
	}
	//Hdfc is subclass which inherit parentclass Bank 
class Hdfc extends Bank
{
	public void hdfcLoan() {//HdfcLoan Method
		System.out.println("For HDFC");
	}
	}
	//Axis is subclass which inherit parentclass Bank 
class Axis extends Bank
{
	public void axisLoan() {//axisLoan Method
		System.out.println("For AXIS");
	}
	}
public class HirarachicalInheritance {

	public static void main(String[] args) {
		Axis ax=new Axis(); //instantiate Axis class 
		ax.axisLoan();
		ax.loanInterest();
		Hdfc hd=new Hdfc();//instantiate Hdfc class 
		hd.hdfcLoan();
		hd.loanInterest();
		Sbi sb=new Sbi();//instantiate Sbi class
		sb.sbiLoan();
		sb.loanInterest();
	}

}
