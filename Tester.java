import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;

public class Tester 
{
    public static void main(String [] arg){
        BucketGame game = new BucketGame();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(730, 730);
        frame.setLocation(0, 0);
        frame.addKeyListener(game);
        frame.getContentPane().add(game);
        frame.setVisible(true);
    }
}
