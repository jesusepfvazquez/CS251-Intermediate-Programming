
// Java program to create a frame  
// using Swings in main(). 
  
import javax.swing.*; 
public class Swing_example { 


    public static void main(String[] args) { 
        // creates instance of JFrame 
        JFrame frame1 = new JFrame(); 
  
        // creates instance of JButton 
        JButton button1 = new JButton("click"); 
  
        // x axis, y axis, width, height 
        button1.setBounds(400, 100 ,80, 80); 
  
        // adds button1 in Frame1 
        frame1.add(button1); 
  
        // 400 width and 500 height of frame1 
        frame1.setSize(500, 500) ; 
          
        // uses no layout managers 
        frame1.setLayout(null); 
          
        // makes the frame visible 
        frame1.setVisible(true); 
    } 
} 