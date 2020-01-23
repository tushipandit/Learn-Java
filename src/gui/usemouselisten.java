package gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class usemouselisten extends JFrame{
		
	private JPanel mousepanel;
	private JLabel statusbar;
	
	public usemouselisten() {
		super("the title");
		
		mousepanel = new JPanel();
		mousepanel.setBackground(Color.WHITE);
		add(mousepanel,BorderLayout.CENTER);
		
		statusbar = new JLabel("default");
		add(statusbar,BorderLayout.SOUTH);
		
		Handlerclass handler = new Handlerclass();
		mousepanel.addMouseListener(handler);
		mousepanel.addMouseMotionListener(handler);
	}
	
	public class Handlerclass implements MouseListener , MouseMotionListener {
		
		public void mouseClicked(MouseEvent event) {
				statusbar.setText(String.format("Clicked at %d, %d",event.getX(),event.getY()));
			}
		public void mousePressed(MouseEvent event) {
				statusbar.setText("you pressed down the mouse");
		}
		public void mouseReleased(MouseEvent event) {
				statusbar.setText("you released the button");
		}
		public void mouseEntered(MouseEvent event) {
				statusbar.setText("you entered the area");
				mousepanel.setBackground(Color.RED);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			statusbar.setText("the mouse has left the window");
			mousepanel.setBackground(Color.WHITE);
			
		}
		//mouse motion event
		public void mouseDragged(MouseEvent event) {
			statusbar.setText("you aredragging the mouse");
		}
		public void mouseMoved(MouseEvent event) {
			statusbar.setText("you moved the mouse");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		usemouselisten usl =new usemouselisten();
		usl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		usl.setSize(500,500);
		usl.setVisible(true);

	}

}
