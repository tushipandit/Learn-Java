//we are using adapter rather than implementing the whole class and methods
package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class useadapter extends JFrame{

	private String details;
	private JLabel statusbar;
	
	public useadapter() {
		super("the title");
		statusbar = new JLabel("this is the default");
		add(statusbar,BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
	}
	
	//using in-built mouseadapter to use only required method to overide
	private class Mouseclass extends MouseAdapter{
		
		public void mouseClicked(MouseEvent event) {
			details = String.format("you clicked %d", event.getClickCount());
			
			if(event.isMetaDown())
				details += "with right mouse button";
			else if(event.isAltDown())
				details +="with center mouse button";
			else
				details +="with left mouse button";
			
			
		statusbar.setText(details);
		}
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useadapter usd =new useadapter();
		usd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		usd.setSize(500,500);
		usd.setVisible(true);
	}

}
