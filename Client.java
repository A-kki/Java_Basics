import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.Scanner;
public class Client
{
	static public void main(String args[])throws Exception
	{
	Scanner sc=new Scanner(System.in);
	out.println("Enter IP address");
	String ipad=sc.next();
	Socket ss=new Socket(ipad,2000);
	out.println("start chatting");
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	PrintStream ps =new PrintStream(ss.getOutputStream());
	while(true)
		{
			String data=br.readLine();
			if(data==null)
				break;
			ps.println(data);
		}
	}
}