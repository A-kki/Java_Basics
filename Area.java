
import java.util.Scanner;
class Area
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int r=sc.nextInt();
		double areaOfCircle=r*r*3.14;
		System.out.println("Area of circle is :" + areaOfCircle);
	
		System.out.println("Enter Lenth and width of rctangle");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int areaOfRectangle=l*b;
		System.out.println("Area of Rectangle :" + areaOfRectangle);
	

		System.out.println("Enter base and height of tiangle (respectivly)");
		int base =sc.nextInt();
		int h=sc.nextInt();
		int areaOfTriangle=base*h/2;
		System.out.println("Area of triangle :" + areaOfTriangle);
	
	}
}