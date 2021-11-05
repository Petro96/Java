// import java.awt.*;
// import java.awt.Color;
// import java.time.temporal.TemporalField;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// import javax.swing.*;
// import javax.swing.JTextArea;
// import javax.swing.JFrame;
// import javax.swing.JButton;
// import javax.swing.JLabel;

// public class TextArea extends JFrame{
    
//     JTextArea text;
//     JLabel label;
//     JButton button;
//     JFrame frame;
    

//     public TextArea(){

//         setLayout(new FlowLayout());
//         frame = new JFrame();
//         text = new JTextArea(5,30); // 5-rows , 30-columns
//         label = new JLabel();
//         label.setBounds(100,100,700,500);
//         label.setBackground(Color.red);
//         label.setVisible(true);
//         button = new JButton("Click Me");
        
        
//         this.add(text);
//         this.add(label);
//         this.add(button);
        

//         Event event = new Event();   //Event class
//         button.addActionListener(event);

        
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setSize(500,500);
//         this.setVisible(true);
//         this.setLayout(null);


//     }

//     public class Event implements ActionListener{

//         public void actionPerformed(ActionEvent e){

//             String t = text.getText(); //String text = textFromArea.getText();

//             label.setText(t); // setText to the label


//         }

//     }



// }
