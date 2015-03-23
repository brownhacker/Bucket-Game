import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class BucketGame extends JPanel implements KeyListener {
    
    char c;
    Bucket  bucket1, bucket2;
    boolean gameOver;

    public BucketGame() {
        bucket1 = new Bucket (150, 0, 350);
        bucket2 = new Bucket (425, 0, 350);
        
        //initialize gameOver
        

    }

    /** Handle the key released event from the text field. */
    public void keyReleased(KeyEvent e) {
        if(!gameOver){
            c = e.getKeyChar();
            //check which button is released and empty and fill the respective buckets
            if(c == 's'){
                System.out.println("You pressed s");
                bucket1.empty(10);
                bucket2.fill(10);
                }
            if(c == 'k'){
                System.out.println("You pressed k");
                bucket2.empty(10);
                bucket1.fill(10);

            }
            

            //check whether someone won
            //if they did declare a winner and change gameOver
                       
                repaint();
        }
    }
    
    
    
    public void paint(Graphics g){
        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 0, 1000, 1000);
        int red = (int)(256 * Math.random());
        int green = (int)(256 * Math.random());
        int blue = (int)(256 * Math.random());
        g.setColor(new Color(red, green, blue));
        g.fillRect(150, 0, 100, 700);
        int a = (int)(256 * Math.random());
        int b = (int)(256 * Math.random());
        int c = (int)(256 * Math.random());
        g.setColor(new Color(a, b, c));
        g.fillRect(425, 0, 100, 700);
        //tell the two buckets to paint themselves
        bucket1.paint(g);
        bucket2.paint(g);
       
        
    }
    
    public void keyTyped(KeyEvent e) {
        
        c = e.getKeyChar();     
    }

    public void keyPressed(KeyEvent e) {
        c = e.getKeyChar();
    }
}
