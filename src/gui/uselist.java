package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class uselist extends JFrame {
	
	private JList<Object> list;
	private static String[] colornames = {"black","blue","red","white"};
	private static Color[] colors= {Color.BLACK ,Color.BLUE,Color.RED,Color.WHITE};
	
	public uselist() {
		
		super("the titile");
		setLayout(new FlowLayout());
		
		list = new JList<Object>(colornames);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
						
					}
				}
				
				);
	}

	public static void main(String[] args) {
	
		uselist us=new uselist();
		us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		us.setSize(400,400);
		us.setVisible(true);
	}

}
