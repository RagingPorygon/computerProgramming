import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI02 extends JFrame
{
    // Step 1 : create JLabel variable
    private JLabel label;
    
    // constructor
    public GUI02()
    {   
        // Step 2 : create JLabel object and store its reference in label
        label = new JLabel("This is a test");
        
        // Step 3 : set label attributes
        label.setLocation(10, 200);
        label.setSize(200, 20);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        
        //add to the frame
        
        getContentPane().add(label);
        
        // Step 4: add label to content pane of frame
        getContentPane().add(label);
        
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
        GUI02 app = new GUI02();   // run program
    }
}