import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;




public class GUI extends JFrame {

    GUIT(){

        //JFrame frame = new JFrame();

        this.setTitle("My Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setVisible(true);
        this.setResizable(false); // resizable ? 

        //set image icon on the frame
        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());

        //set background color
        this.getContentPane().setBackground(new Color(125,50,250)); //rgb - 000-black,255255255-white ,      hexa 

    }


    
}
