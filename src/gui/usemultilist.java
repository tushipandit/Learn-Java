package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class usemultilist extends JFrame{
	private JList leftlist;
	private JList<Object> rightlist;
	private JButton movebutton;
	private static String[] foods = {"jalebi","sonpapdi","kajukatli","sonhalwa"};

	public usemultilist() {
		super("title");
		setLayout(new FlowLayout());
		
		leftlist = new JList(foods);
		leftlist.setVisibleRowCount(3);
		leftlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(leftlist));
		
		movebutton = new JButton("Move ---->");
		movebutton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						rightlist.setListData(leftlist.getSelectedValues());
					}
				}	
				);
		add(movebutton);
		
		rightlist=new JList<Object>();
		rightlist.setVisibleRowCount(3);
		rightlist.setFixedCellWidth(100);
		rightlist.setFixedCellHeight(15);
		rightlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightlist));
		
		
	}
	
	public static void main(String[] args) {
		
		usemultilist mu = new usemultilist();
		mu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		mu.setSize(500,500);
		mu.setVisible(true);	
	}
}
