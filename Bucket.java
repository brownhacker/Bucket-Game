import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.awt.*;
import java.util.*;

public class Bucket{
    int amount;
    int x, y;
    
    public Bucket(int aX, int aY, int anAmount){
        x = aX;
        y = aY;
        amount = anAmount;
        
    }
    
    
    public void fill(int diff){
        //change the amount of water
        amount+= diff;
        
    }

    public void empty(int diff){
        //change the amount of water
        amount-= diff;
        
    }
    
    public boolean isEmpty(){
         return amount<= 0;
        //return false;
    }

    public void paint(Graphics g){
        g.setColor(new Color(255,255,255));
        g.fillRect(x, y, 100, amount);
        
    }
    
    
}
