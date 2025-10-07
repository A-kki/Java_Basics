import static java.lang.System.out;
import java.util.Scanner;
class UpperCase
{
	public static void main(String[] args)
  {
	Scanner sc =new Scanner(System.in);
	out.println("Enter string");
	String str=sc.nextLine();
	char[] ch=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		ch[i]=(char)(ch[i]-32);
	}
	out.println(ch);
   }
} 
