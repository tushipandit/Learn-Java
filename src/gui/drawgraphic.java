package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class drawgraphic extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(25, 25, 100, 30);
		
		g.setColor(new Color(190,81,215));
		g.fillRect(25, 65, 100, 30);
		
		g.setColor(Color.RED);
		g.drawString("this is some text", 125, 190);
		
		g.setColor(Color.BLUE);
		g.drawLine(10, 25, 200, 45);
		
		g.setColor(Color.RED);
		g.drawRect(10, 55, 100, 30);
		
		g.setColor(Color.GREEN);
		g.fillOval(10, 95, 100, 30);
		
		g.setColor(Color.ORANGE);
		g.fill3DRect(10, 160,100, 50, true);
		
	}
	
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawgraphic d=new drawgraphic();
		f.add(d);
		f.setSize(400,250);
		f.setVisible(true);
		
	}

}
