package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class usecheckbox extends JFrame {
	
	private JTextField tb;
	private JCheckBox bold;
	private JCheckBox italics;
	
	public usecheckbox() {
			
		super("the title");
		setLayout(new FlowLayout());
		
		tb = new JTextField("this is the input text",20);
		tb.setFont(new Font("Input",Font.PLAIN,14));
		add(tb);
		
		bold = new JCheckBox("bold");
		italics = new JCheckBox("italics");
		
		add(bold);
		add(italics);
		
		HandlerClass handler = new HandlerClass();
		bold.addItemListener(handler);
		italics.addItemListener(handler);
		
		
	}
	
	private class HandlerClass implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			if(bold.isSelected() && italics.isSelected())
			{
				font=new Font("Input",Font.BOLD+Font.ITALIC,14);
				
			}
			else if(bold.isSelected()) {
				font=new Font("Input",Font.BOLD,14);
			}
			else if(italics.isSelected())
			{
				font=new Font("Input",Font.ITALIC,14);
			}
			else
			{
				font = new Font("Input",Font.PLAIN,14);
			}
			
			tb.setFont(font);
		}
		
	}
	

	public static void main(String[] args) {
		
		usecheckbox ch = new usecheckbox();
		ch.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ch.setSize(300,400);
		ch.setVisible(true);

	}

}
