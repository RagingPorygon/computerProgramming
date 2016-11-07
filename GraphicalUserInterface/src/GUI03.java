import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI03 extends JFrame
{
    // Step 1 : create JLabel variable
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    
    // constructor
    public GUI03()
    {   
        // Step 2 : create JLabel object and store its reference in label
        label1 = new JLabel("Don't");
        label2 = new JLabel("Mess");
        label3 = new JLabel("With");
        label4 = new JLabel("Texas");
        
        // Step 3 : set label attributes
        label1.setLocation(150, 40);
        label1.setSize(200, 60);
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("Arial", Font.PLAIN, 72));
        label2.setLocation(150, 140);
        label2.setSize(200, 60);
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Arial", Font.PLAIN, 72));
        label3.setLocation(150, 240);
        label3.setSize(200, 60);
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Arial", Font.PLAIN, 72));
        label4.setLocation(150, 340);
        label4.setSize(200, 60);
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("Arial", Font.PLAIN, 72));
        
        // Step 4: add label to content pane of frame
        getContentPane().add(label1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(label4);
        
        // set frame attributes
        setLayout(null);                                 // no layout used
        setSize(500, 500);                               // sets size of frame window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // program quits when close icon is pressed
        getContentPane().setBackground(Color.white);     // set background color
        setVisible(true);                                // show frame
    }
    
    // main method
    public static void main(String[] args)
    {
        GUI03 app = new GUI03();   // run program
    }
}