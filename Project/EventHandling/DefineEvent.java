import java.awt.FlowLayout;
import java.awt.event.ActionListener; // do something,press enter(awt-abstract window toolkit)
import java.awt.event.ActionEvent; 
import javax.swing.*; 
import javax.swing.JFrame;           // swing - widget GUI toolkit JFC (java foundation classes)
import javax.swing.JTextField;
import javax.tools.Tool;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.Toolkit;




// public class DefineEvent extends JFrame{

//     private JTextField item1;
//     private JTextField item2;
//     private JTextField item3;
//     private JPasswordField passwordField;
//     public JButton b;

//     public DefineEvent(){

//         super("Title");

//         setLayout(new FlowLayout()); //define layout

//         item1 = new JTextField(10);
//         add(item1);

//         item2 = new JTextField("Enter text here");
//         add(item2);

//         item3 = new JTextField("uneditable",20);
//         item3.setEditable(false);
//         add(item3);

//         passwordField = new JPasswordField("myPass");
//         add(passwordField);

//         b = new JButton("Click Here"); 
//         add(b);

//         //Action listener

//         theHandler handler = new theHandler(); // main object for ActionListener

//         item1.addActionListener(handler);
//         item2.addActionListener(handler);
//         item3.addActionListener(handler);
//         passwordField.addActionListener(handler);
//         b.addActionListener(handler);


//     }

//     private class theHandler implements ActionListener{ // interface
        
//         public void actionPerformed(ActionEvent e){ // e - enter for example

//             String string = "";

//             if (e.getSource()==item1){
//                 string = String.format("field 1 %s",e.getActionCommand()); // get text from that location
//             }
//             else if (e.getSource()==item2){
//                 string = String.format("field 2 %s",e.getActionCommand()); // get text from that location
//             }
//             else if(e.getSource()==item3){
//                 string = String.format("field 3 %s",e.getActionCommand()); // get text from that location
//             }
//             else if(e.getSource()==passwordField){
//                 string = String.format("passwordField %s",e.getActionCommand());
//             }
//             else if(e.getSource()==b){
//                 // what happen when I take ActionListener
//                 string = String.format("Button %s",e.getActionCommand());

//             }


//             JOptionPane.showMessageDialog(null,string);
//         }


//     }


// }

// ---------------------------- Action Listenner, TextArea(Append,Clear), Exit

public class DefineEvent extends JFrame{

    JTextField field;
    JLabel label; 
    JButton button1;
    JButton button2;
    JButton button3;
    JTextArea area;


    DefineEvent(){

        super("Action Listenner");

        setLayout(new FlowLayout());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setVisible(true);
        this.setResizable(true);
        
        label = new JLabel("Type same text: ");
        add(label);

        field = new JTextField(20);
        add(field);

        button1 = new JButton("Append");
        add(button1);

        button2 = new JButton("Clear");
        add(button2);

        button3 = new JButton("Exit");
        add(button3);

        area = new JTextArea(20,20);
        add(area);

        EventAppend eventAppend = new EventAppend();

        EventClear eventClear = new EventClear();

        EventExit exit = new EventExit();

        button1.addActionListener(eventAppend);
        button2.addActionListener(eventClear);
        button3.addActionListener(exit);



    }

    public void close(){
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }


    private class EventAppend implements ActionListener{

        public void actionPerformed(java.awt.event.ActionEvent e){   // Append
            String text = field.getText(); // append text from file
            area.append(text+"\n");
            
        }
    }

    private class EventClear implements ActionListener{             // Clear
        public void actionPerformed(ActionEvent e){
            field.setText("");
            area.setText("");
        }

    }

    private class EventExit implements ActionListener{           //Exit

        public void actionPerformed(ActionEvent e){
            close();
        }

    }


    // private void btnClearActionPerformed(ActionEvent event){

    // }

    // private void btnAppendActionPerformed(ActionEvent event){}

}
