package gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class usingevents extends JFrame{

	private JTextField text1, text2, text3;
	private JPasswordField passwordfield;
	
	public usingevents() {
		super("title bar");
		setLayout(new FlowLayout());
		
		text1=new JTextField(10); //size 10
		add(text1); //add to window
		
		text2=new JTextField("enter the text");
		add(text2);
		
		text3=new JTextField("uneditable",30);
		text3.setEditable(false);
		add(text3);
		
		passwordfield =new JPasswordField("enter password");
		add(passwordfield);
		
		thehandler handler = new thehandler();
		text1.addActionListener((ActionListener) handler);
		text2.addActionListener(handler);
		text3.addActionListener(handler);
		passwordfield.addActionListener(handler);

	}
	
	private class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			String string ="";
			if(event.getSource()==text1) {
				string=String.format("field 1 : %s", event.getActionCommand());
			}else if(event.getSource()==text2) {
				string=String.format("field 2 : %s", event.getActionCommand());
			}else if(event.getSource()==text3) {
				string=String.format("field 3 : %s", event.getActionCommand());
			}else if(event.getSource()==passwordfield) {
				string=String.format("passwordfield 1 : %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
		}
		
	}
	
	
	
	public static void main(String args[]) {
		
			usingevents us=new usingevents();
			us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			us.setSize(350, 350);
			us.setVisible(true);
			
			
		
	}
	
	
	
}
