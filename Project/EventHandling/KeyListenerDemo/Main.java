//package KL;



import java.lang.*;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main {

	public static void main(String[] args) {
		
		//System.out.println("Hello World!");
		
		JFrame frame = new JFrame();
		
		//JPanel panel = new JPanel(new FlowLayout()); 

        PanelDemo panel = new PanelDemo();
		
		//JTextField field = new JTextField(20);
		
		//field.addKeyListener(new KeyDemo()); // adding keyListener to field !!
		
		//panel.add(field);  // in panel add field / in frame add panel
		frame.getContentPane().add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
	
	}
	
}
