import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.JOptionPane;

public class MainGUI {


    public static void main(String[] args){

        //GUI gui = new GUI(); // new GUIT(); // ----> for GUI.java class

        String name =JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null,"You are "+age+" years old.");


        


    }

    
}
