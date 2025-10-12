import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;


class Window1 extends JFrame 
{

	Window1()
	{
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		getContentPane().setBackground(Color.green);
		setForeground(Color.white);
		setFont(new Font("arial", 0,30));
		setTitle("this is swing window");
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked (MouseEvent e)
		{

			int red=(int)(Math.random()*250);
			int green=(int)(Math.random()*250);
			int blue=(int)(Math.random()*250);
			getContentPane().setBackground(new Color(red, green, blue));
			System.out.println(red+" "+green+" "+blue);
		}

		});
		addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved (MouseEvent e)
		{

		int red=(int)(Math.random()*200);
		int green=(int)(Math.random()*200);
		int blue=(int)(Math.random()*200);
		getContentPane().setBackground(new Color(red, green, blue));
		System.out.println(red+" "+green+" "+blue);
		}
		});
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}

		});
	}
		public static void main(String...args)
		{
			new Window1();
		}
}
