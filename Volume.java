import java.util.Scanner;

public class Volume 
{


    public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter radius");
        	int r = sc.nextInt();
        	System.out.println("Enter height");
        	int h = sc.nextInt();
	
        	double sphere =(4.0 / 3) * r * r * r * 3.14;
        	double Cylinder= r * r * h * 3.14;
        	double Cone =(1.0 / 3) * r * r * h * 3.14; 

        	System.out.println("Volume of sphere: " + sphere);
        	System.out.println("Volume of cylinder: " + Cylinder);
        	System.out.println("Volume of cone: " + Cone);
    	}
}
