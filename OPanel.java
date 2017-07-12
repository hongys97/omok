import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 
import java.awt.event.MouseAdapter;

public class OPanel extends JPanel{

    public OPanel(){
    
        setSize(500,500);
        addMouseListener(new MouseAdapter());
        
    }
}