import static java.lang.System.out;
class Data
{
	void set(int...ar)
	{
		int SUM =0;
		for(int data:ar)
		{
			SUM =SUM+data;
        	}
   		out.println("Sum of elments are"+SUM);
 	}  
}
class VarSearch
{
	public static void main(String[] args)
	{
		Data ref =new Data();
		ref.set(5,6,5,4,32,4);
	}
}