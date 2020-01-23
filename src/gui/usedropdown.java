package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class usedropdown extends JFrame{
	
	private JComboBox box;
	private JLabel picture;
	private static String[] filename= {"home.png","insta.png"};
	private Icon[] pics = {new ImageIcon(getClass().getResource(filename[0])),new ImageIcon(getClass().getResource(filename[1]))};
	
	
	public usedropdown() {
		
		super("the title");
		setLayout(new FlowLayout());
		
		box=new JComboBox(filename);
		
		box.addItemListener(
				new ItemListener() {
					public void itemStateChanged(ItemEvent event) {
						if(event.getStateChange()==ItemEvent.SELECTED)
						{
							picture.setIcon(pics[box.getSelectedIndex()]);
						}
					}
				}
				);
		
		add(box);
		picture =new JLabel(pics[0]);
		add(picture);	
	}
	public static void main(String[] args) {
		usedropdown usd=new usedropdown();
		usd.setDefaultCloseOperation(JOptionPane.CLOSED_OPTION);
		usd.setSize(500,500);
		usd.setVisible(true);	
	}
}
