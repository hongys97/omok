import java.swing.JFrame;

public class Gameboard{
    

    // we create the visual board within the constructor 
    public Gameboard(int length, int height){
        
        JFrame window = new JFrame;
        window.setSize(length, height);
        window.setTitle("Omok Game");
        
        // loops that create the lines that make up the board 
        for (int x = 0; x <= length; x++){
            for (int y = 0; y <= height; y++){
                
                // create lines
                window.drawLine(x, 0, x, height);
                window.drawLine(0, y, length, y);
            }
        }
    }
}
                