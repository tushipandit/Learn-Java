package gui;
import javax.swing.JOptionPane;
import java.util.Random;
public class simplegui {

	public static void main(String[] args) {
		String fn=JOptionPane.showInputDialog("enter the guess number b/w 4");
		Random r=new Random();
		int x=r.nextInt(3)+1;
		int num=Integer.parseInt(fn);
		if(num==x)
		{
			JOptionPane.showMessageDialog(null, "you guess is correct");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "you guess is wrong");
		}
	}

}
