import javax.swing.*;

import java.awt.*;

import java.util.Vector;

public class Gameboard extends JFrame{
    
    private static final int borderIncrement = 30; 
    private static final int dy = 15;
    
    private static final int size = 570;
    
    //private Vector 

    // we create the visual board within the constructor 
    public Gameboard(){     
        setSize(size, size-dy);
        setTitle("Omok Game");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void paint(Graphics g){
        
        g.setColor(Color.ORANGE);
        g.fillRect(0,0,size,size-dy);
        
        g.setColor(Color.BLACK);
        
        for (int x = borderIncrement; x <= size; x=x+borderIncrement){
            for (int y = borderIncrement+dy; y <= size; y=y+borderIncrement){
                
                g.drawLine(x,45,x,size-45);
                g.drawLine(borderIncrement,y,size-borderIncrement,y);
            }
        }
        
    }
    
    public static void main(String[] args){
       new Gameboard();
    }
}
                