package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class colorchoser extends JFrame{

	private JButton b;
	private Color color= (Color.white);
	private JPanel panel;
	
	public colorchoser(){
		super("The title");
		panel = new JPanel();
		panel.setBackground(color);
		
		b= new JButton("choose a color");
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						color = JColorChooser.showDialog(null, "pick a color", color);
						if(color==null)
							color=(Color.WHITE);
						
						
						panel.setBackground(color);
					}
				});
		
		add(panel,BorderLayout.CENTER);
		add(b,BorderLayout.SOUTH);
		setSize(425,150);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		colorchoser c =new colorchoser();
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
