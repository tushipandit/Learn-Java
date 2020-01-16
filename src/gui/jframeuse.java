package gui;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class jframeuse extends JFrame{
	
	private JLabel item;
	
	public jframeuse(){
		
		super("title bar");
		setLayout(new FlowLayout());
		
		item=new JLabel("this is the first Jframe");
		
		item.setToolTipText("ths is shown on Hover over it");
		
		add(item);
		
	}
	
	public static void main(String args[])
	{
		jframeuse jf=new jframeuse();
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close button
		jf.setSize(250, 250);
		jf.setVisible(true);
		
		
	}
	

}
