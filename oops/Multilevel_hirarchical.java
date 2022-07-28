package oops;
class Mi
{
	public void miPhonnes()
	{
		System.out.println("There are two Type of MI phones");
		
	}
	}
//Hirarchical Inheritence
class Redmi extends Mi
{
	public void redmi()
	{
		System.out.println("1.RedMi");
	}
	public void features()
	{
		System.out.println("Features of redmi: ");
	}
	}
//Hirarchical Inheritence
class Poco extends Mi
{
	public void poco()
	{
		System.out.println("2.Poco");
	}
	}
class RedmiNote9 extends Redmi//multilevel Inheritance
{
	public void redminote9() {
	System.out.println("Redmi Note9 Has Camera: 48 MP Ram:6 GB,ROM:128 GB");
	}
}
public class Multilevel_hirarchical {

	public static void main(String[] args) {
		Redmi rm=new Redmi();
		rm.miPhonnes();
		rm.redmi();
		Poco pc=new Poco();
		pc.poco();
		RedmiNote9 rmn=new RedmiNote9();
		rmn.features();
		rmn.redminote9();

	}

}
