import static java.lang.System.out;
import java.util.Scanner;
class ArrayEvenOdd
{
	public static void main(String[] args)
	{
        	Scanner sc = new Scanner(System.in);
		int SUMEV=0;
		int SUMOD=0;
        	int EVEN =0;
	
        	out.println("enter size");
		int size=sc.nextInt();
		int ar[]=new int[size];
		out.println("enter elements");
		for(int i=0;i<size;i++)
		{
          		ar[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)	
		{
        		if(ar[i]%2==0)
			{
			SUMEV =SUMEV +ar[i];
			}
			else
			{
				SUMOD=SUMOD+ar[i];
			}	
  		}
		
 	out.println("The sum of even element of array is "+SUMEV);
				
	out.println("The sum of odd elements of array is "+SUMOD);
 			
			
	}
}