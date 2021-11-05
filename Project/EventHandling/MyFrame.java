// import java.awt.Color;
// import java.awt.event.*;
// import javax.swing.*;
// import javax.swing.JFrame;





// public class MyFrame extends JFrame implements KeyListener{ // listener interface

//     JLabel label;
//     ImageIcon icon;

//     public MyFrame(){ // constructor

//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setSize(500,500);
//         this.setLayout(null);
//         this.addKeyListener(this);  //declare keyListener: keyTyped,keyPressed,keyReleased


//         icon = new ImageIcon("rocket2.jpeg");

//         label = new JLabel();
//         label.setBounds(0,0,100,100);
//         //label.setBackground(Color.red); // you ned opaque for Color
//         //label.setOpaque(true);
//         label.setIcon(icon);

//         this.add(label);

//         this.getContentPane().setBackground(Color.white); // set background color of frame
//         this.setVisible(true);
//     }

    
//     @Override
//     public void keyTyped(KeyEvent e){  //use key character,char output // KeyListener-keyEvent / ActionListener - ActionEvent
        
//         switch(e.getKeyChar()){ 

//             case 'a':label.setLocation(label.getX()-10,label.getY()); // x = -1 ->> to the left (1 - 10 pixel movment)
//                 break;

//             case 'w':label.setLocation(label.getX(),label.getY()-10); // y = -1 ->> to the up
//                 break;

//             case 's':label.setLocation(label.getX(),label.getY()+10); // y = +1 ->> to down
//                 break;

//             case 'd':label.setLocation(label.getX()+10,label.getY()); // x = +1 ->> to the left
//                 break;

//         }


//     }

//     @Override
//     public void keyPressed(KeyEvent e){ // physical key pressed (you can move with arrow keys)

//         switch(e.getKeyCode()){ 

//             case 37:label.setLocation(label.getX()-10,label.getY()); 
//                 break;

//             case 38:label.setLocation(label.getX(),label.getY()-10); 
//                 break;

//             case 39:label.setLocation(label.getX()+10,label.getY()); 
//                 break;

//             case 40:label.setLocation(label.getX(),label.getY()+10); 
//                 break;

//         }
//     }

//     @Override
//     public void keyReleased(KeyEvent e){ // whenever button is released
//         System.out.println("You released key character "+e.getKeyChar());
//         System.out.println("You released key code "+e.getKeyCode()); // code for the pressed key
//     }


    
// }
