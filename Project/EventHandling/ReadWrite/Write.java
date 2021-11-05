import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.io.FileWriter;




public class Write implements ActionListener{ // extend JFrame

    JFrame frame = new JFrame("Sign Up form");

    JTextField userName = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel userNameLabel = new JLabel("User Name: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JButton button = new JButton("Sign Up ");
    JLabel blank = new JLabel();

    //FileWriter writer = new FileWriter();

    Write(){

        GridLayout g1 = new GridLayout();
        g1.setColumns(2);
        g1.setRows(3);

        frame.setLayout(g1);

        button.addActionListener(this);
        frame.add(userNameLabel);
        frame.add(userName);
        frame.add(passwordLabel);
        frame.add(password);
        frame.add(blank);
        frame.add(button); 
        

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }

    public void actionPerformed(java.awt.event.ActionEvent e){

        if(e.getActionCommand() == button.getActionCommand()){ //when we click

            try{

                 FileWriter writer = new FileWriter("userInfo.txt",true); //true- appending,false-rewrite //file must be created !!!!
                 writer.write(userNameLabel.getText()+""+userName.getText()+"\n");
                 writer.write(passwordLabel.getText()+""+password.getText()+"\n"); //getPassword
                 //writer.append("Something appended");
                 writer.close();
                 JOptionPane.showMessageDialog(null,"File Written Successfully!");
            }
            catch(Exception o){
                System.err.println("Something went wrong!");
            }
            finally{
                System.err.println("Try-catch is finished!");
            }
        }
    }

}

  


 
