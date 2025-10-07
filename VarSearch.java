import static java.lang.System.out;
import java.util.Scanner;
class Data
{
	void set(int...ar)
	{
	  Scanner sc=new Scanner(System.in);
	  out.println("enter no.");
	  int key =sc.nextInt();
	  int RESULT=0;
	  for(int data:ar)
		{
	  		if(key==data)
			{
	 	     		RESULT++;
	       			break;
			} 
 		}
	  if (RESULT==1)
		{
			out.println("Element Found");
		}
	  else
		{
			out.println("Not Found");
    		} 
   	}
}
class VarSearch
{
	public static void main(String[] args)
	{
		Data ref =new Data();
		ref.set(10,5,4,3,2,7);
        }
}
