package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class usebutton extends JFrame {

	private JButton reg;
	private JButton custom;
	
	public usebutton() {
		super("the tittle");
		setLayout(new FlowLayout());
		reg = new JButton("reg Button");
		add(reg);
		
		Icon insta = new ImageIcon(getClass().getResource("/Learn-Java/images/insta.png"));
		Icon home =new ImageIcon(getClass().getResource("/Learn-Java/images/home.png"));
		
		custom =new JButton("Custom",insta);
		custom.setRolloverIcon(home);
		add(custom);
		
		HandlerClass handler =new HandlerClass();
		reg.addActionListener(handler);
		custom.addActionListener(handler);
	}
	
	 private class HandlerClass implements ActionListener{ //implemented class used to override all methods of the implemented class
		 public void actionPerformed(ActionEvent event) {
			 	JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		 } 
	 }
	
	public static void main(String[] args) {
		usebutton ub=new usebutton();
		ub.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ub.setSize(300,200);
		ub.setVisible(true);
		 
		
	}

}
