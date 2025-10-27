
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.TextArea;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;

public class Window extends JFrame implements MouseListener, MouseMotionListener, WindowListener
{

	Window()
	{
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		getContentPane().setBackground(Color.green);
		setForeground(Color.white);
		setFont(new Font("arial", 0,30));
		setTitle("this is swing window");
		setVisible(true);
		setSize(500,500);
		getContentPane().setBackground(Color.green);
		setForeground(Color.white);
		setFont(new Font("arial", 0,30));  //font family, font weight, font size
		setTitle("this is swing window");
		JLabel jLabel=new JLabel("swing");
		JTextField jTextField=new JTextField(20);
		TextArea textArea=new TextArea(10,10);
		add(jTextField);
		add(jLabel);
		add(textArea);
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(this);
	}
	public static void main(String[] args)
	{
		new Window();
	}
		public void mouseClicked (MouseEvent e)
		{

			int red=(int)(Math.random()*250);
			int green=(int)(Math.random()*250);
			int blue=(int)(Math.random()*250);
			getContentPane().setBackground(new Color(red, green, blue));
			System.out.println(red+" "+green+" "+blue);
		}
		public void mousePressed (MouseEvent e){}
		public void mouseReleased (MouseEvent e){}
		public void mouseExited (MouseEvent e){}
		public void mouseEntered (MouseEvent e){}

		public void mouseMoved (MouseEvent e)
		{

		int red=(int)(Math.random()*200);
		int green=(int)(Math.random()*200);
		int blue=(int)(Math.random()*200);
		getContentPane().setBackground(new Color(red, green, blue));
		System.out.println(red+" "+green+" "+blue);

		}
		public void mouseDragged(MouseEvent e){}
		
		public void windowClosing(WindowEvent e)
		{
			System.exit(0);
		}
		public void windowClosed(WindowEvent e){};
		public void windowActivated(WindowEvent e){};
		public void windowDeactivated(WindowEvent e){};
		public void windowIconified(WindowEvent e){};
		public void windowDeiconified(WindowEvent e){};
		public void windowOpened(WindowEvent e){};


}
