import java.util.Scanner;
import static java.lang.System.out;
class ArrayConcept
{
public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		out.println("Enter the size of array");
		int size=sc.nextInt();
		int ar[]=new int[size];
		out.println("Enter elements now : ");
		for(int i=0;i<size;i++){
			ar[i]=sc.nextInt();
			}
	
	out.println("Array Elements Are:");
		for(int i=0;i<size;i++)
		{
			out.println(ar[i]);
		}


	}
}