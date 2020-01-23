package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class useflowlayout extends JFrame{

	private JButton lb;
	private JButton cb;
	private JButton rb;
	private FlowLayout layout;
	private Container container;
	
	public useflowlayout() {
		
		super("the title");
		layout=new FlowLayout();
		container = getContentPane();
		setLayout(layout);
		
		lb = new JButton("left");
		lb.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(container);	
					}
		});
		add(lb);
		
		cb = new JButton("center");
		cb.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(container);	
					}
		});
		add(cb);
		
		rb = new JButton("right");
		rb.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.RIGHT);
						layout.layoutContainer(container);	
					}
		});
		
		add(rb);
		
	}
	
	
	
	public static void main(String[] args) {
		
		useflowlayout us = new useflowlayout();
		us.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		us.setSize(500,500);
		us.setVisible(true);
		
	}

}
