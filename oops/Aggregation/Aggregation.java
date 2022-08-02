package aggregation;
class TCS
{
	int comId;
	String compName;
	Address address;//entity reference
	public int getComId() {
		return comId;
	}
	public String getCompName() {
		return compName;
	}
	public Address getAddress() {
		return address;
	}
	TCS(int comId,String compName,Address address)
	{
		
		this.comId=comId;
		this.compName=compName;
		this.address=address;
	}
	
	
	
	}


public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add1=new Address(700024,"kolkata","India","Wb");
		Address add2=new Address(723545,"New York","USA","abc");
		TCS com1=new TCS(101,"TCS",add1);
		TCS com2=new TCS(102,"TCS BPS",add2);
		System.out.println("Company id: "+com1.getComId()+"\nCompany Name: "+com1.getCompName()+"\nPincode: "+com1.getAddress().getPincode()+
				"\nCity:"+com1.getAddress().getCity()+"\nCountry: "+com1.getAddress().getCountry()+"\nState: "+com1.getAddress().getState());
		System.out.println("=============================");
		System.out.println("Company id: "+com2.getComId()+"\nCompany Name: "+com2.getCompName()+"\nPincode: "+com2.getAddress().getPincode()+
				"\nCity:"+com2.getAddress().getCity()+"\nCountry: "+com2.getAddress().getCountry()+"\nState: "+com2.getAddress().getState());
		
	}

}
