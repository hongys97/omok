import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class OFrame extends JFrame{
    
    
    private int row, col; 
    
    
    // have to add a JPanel to the contentPane of the JFrame
    // the JPanel implements the mouselistener
    public OFrame(){
        setSize(500,500);
        setTitle("Omok");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel();
        mainPanel.addMouseListener(new MouseAdapter());
            @Override
            public void mousePressed(MouseEvent e){
                clicks++;
                text.setText(clicks + " Clicks");
                }
        
        
    }
    
    
    public void paint(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(30, 30, 450, 450);
        g.setColor(Color.BLACK);
        
        int n = 0;
        Point[][] grid = new Point[16][16]; 
        
        for (int x=30; x<=480; x=x+30){
            row = x/30-1;
            
            String s = String.valueOf(n);
            for (int y=30; y<=500; y=y+30){
                col = y/30-1;
                
                g.drawLine(x, 30, x, 480);
                g.drawLine(30, y, 480, y);
                g.drawString(s, 10, 485-30*n);
                g.drawString(s, 30*n+25, 495);
                
                
                Point p = new Point();
                p.setLocation(x, y);
                grid[row][col] = p;
                
                g.fillOval(x-2, y-2, 4, 4);
            }
            
        if (n!=15) 
            n++;
        }
    }
}
    
    
    