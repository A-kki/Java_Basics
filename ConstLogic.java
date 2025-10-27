class ConstLogic
{
	String city;
	String state;
	long pincode;
	ConstLogic(String city,String state,long pincode)
	{
		this.state=state;
		this.city=city;
		this.pincode=pincode;
	}
	public String toString()
	{
 		return state+" "+ city+" "+pincode+" " ;
 	}
}
class Main
{
	public static void main(String[] args)
	{
		System.out.println(new ConstLogic("Kanpur","UP",560001));
	}
}