package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class useradiobutton extends JFrame {

	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;
	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public useradiobutton() {
		super("the title");
		setLayout(new FlowLayout());
		
		tf= new JTextField("cool", 25);
		add(tf);
		
		pb=new JRadioButton("plain",true);
		bb=new JRadioButton("bold",false);
		ib=new JRadioButton("italic",false);
		bib=new JRadioButton("bold and italic",false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);
		
		
		group =new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		
		pf=new Font("Times new Roman",Font.PLAIN,14);
		bf=new Font("times new roman",Font.BOLD,14);
		itf=new Font("times new roman",Font.ITALIC,14);
		bif=new Font("times new roman",Font.BOLD+Font.ITALIC,14);
		tf.setFont(pf);
		
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));
		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));
	}
	
	private class HandlerClass implements ItemListener{
		
		private Font font;
		
		public HandlerClass(Font f) {
			font =f;
		}
		
		public void itemStateChanged(ItemEvent event) {
			tf.setFont(font);
		}
	}
	
	
	
	
	public static void main(String[] args) {
	
		useradiobutton rb = new useradiobutton();
		rb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		rb.setSize(300,200);
		rb.setVisible(true);
		
		
		
	}

}
