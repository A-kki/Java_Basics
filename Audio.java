import javax.swing.JOptionPane;
import static java.lang.System.out;
import javax.media.Player;
import javax.media.Manager;
import java.io.File;
class Kbc
{
	public static void main(String[] args) throws Exception 
	{
                Player play = Manager.createRealizedPlayer(new File("D:\\javacode\\password.wav").toURI().toURL());
		play.start();
		String password=JOptionPane.showInputDialog("Enter Password");
		if(password.equals("abc"))
		{
			play = Manager.createRealizedPlayer(new File("D:\\javacode\\kbc-question.wav").toURI().toURL());
			play.start();
			int choice=Integer.parseInt(JOptionPane.showInputDialog("Q1. What is the capital of India \n 1.Delhi \n 2.Mumbai \n 3.Chennai \n 4.Surat"));
				if(choice==1)
					{
					play =Manager.createRealizedPlayer(new File("D:\\javacode\\won.wav").toURI().toURL());
					play.start();
					JOptionPane.showMessageDialog(null,"You won 10 Lakhs");
					}
			else
			{
				play =Manager.createRealizedPlayer(new File("D:\\javacode\\no.wav").toURI().toURL());
				play.start();
				JOptionPane.showMessageDialog(null,"You lost everything");
				System.exit(0);
			}
			play = Manager.createRealizedPlayer(new File("D:\\javacode\\kbc-question.wav").toURI().toURL());
			play.start();
			int fQue=Integer.parseInt(JOptionPane.showInputDialog("India won ODI World Cup in \n 1.2011 \n 2.2010 \n 3. 2003 \n 4. 2023"));
			if(fQue==1)
			{
				play =Manager.createRealizedPlayer(new File("D:\\javacode\\won.wav").toURI().toURL());
				play.start();
    				JOptionPane.showMessageDialog(null,"You won 20 Lakhs");
			}
			else
			{
				play =Manager.createRealizedPlayer(new File("D:\\javacode\\no.wav").toURI().toURL());
				play.start();
 				JOptionPane.showMessageDialog(null,"You lost everything");
				System.exit(0);

			}
			play = Manager.createRealizedPlayer(new File("D:\\javacode\\kbc-question.wav").toURI().toURL());
			play.start();
			int sQue=Integer.parseInt(JOptionPane.showInputDialog("Memory is to be free in java by \n 1.Garbage Collector \n 2.Destructor"));
			if(sQue==1)
			{
				play =Manager.createRealizedPlayer(new File("D:\\javacode\\won.wav").toURI().toURL());
				play.start();
				JOptionPane.showMessageDialog(null,"You won 40 lakhs ");
			}
			else
			{
				play =Manager.createRealizedPlayer(new File("D:\\javacode\\no.wav").toURI().toURL());
				play.start();
				JOptionPane.showMessageDialog(null,"You lost everything");
			}
 		

	     
		}
		else
		{
  			JOptionPane.showMessageDialog(null,"INVALID PASSWORD");
 		}
 	}
}
