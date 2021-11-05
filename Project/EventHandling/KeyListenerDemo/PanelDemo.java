//package KL;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Rectangle;

public class PanelDemo extends JPanel{
	
	private Rectangle target = new Rectangle(420,40,60,30); 

    private Rectangle mover = new Rectangle(200,450,15,15);

    @Override
    public void paint(Graphics g){

        
            g.setColor(Color.BLUE);
            g.fillRect(target.x,target.y,target.width,target.height);

            g.setColor(Color.ORANGE);
            g.fillRect(mover.x,mover.y,mover.width,mover.height);

        }



    }
	
	


