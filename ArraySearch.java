import static java.lang.System.out;
import java.util.Scanner;
class ArraySearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int RESULT=0;
		out.println("Enter the size of array : ");
		int size =sc.nextInt();
   		int ar[]=new int[size];
                out.println("Now enter elements");
		for(int i=0;i<size;i++)
		{
			ar[i] = sc.nextInt(); 
 		}
     		out.println("Enter the element to be found");
		int key =sc.nextInt();
                for(int i=0;i<size;i++)
		{
               		if(key==ar[i])
			{
				RESULT++ ;
                        
			}
		}
                if(RESULT>=1)
		{
			out.println("element found "+RESULT+" times");
     		}
		else
		{ 
			out.println("Element not found");
		}
	}
}