

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JTextArea area = new JTextArea(mehtod()); method() => printing results 

public class MyFrame extends JFrame implements ActionListener{
    
    JButton button;
    JLabel label;

    MyFrame(){

        //ImageIcon icon = new ImageIcon("");
        ImageIcon icon2 = new ImageIcon("whitesmile_resize.png");

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150,250,150,100);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100,100,250,100); // define frame
        button.addActionListener(this);  // this - > actionPerformed()// e -> System.out.println("do");
        button.setText("Click Me");
        button.setFocusable(false);
        //button.setIcon(defaultIcon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-15);
        button.setForeground(Color.black);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false); // disenable 

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

        

    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==button){
            System.out.println("I clicked button.");
            button.setEnabled(false); // disenable after first click !!!
            label.setVisible(true); // after click
            System.out.println("Addition: "+add());
        }

    }

    public int add(){
        int a=5;
        int b=6;
        return a+b;
    }


}
