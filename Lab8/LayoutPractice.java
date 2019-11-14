import java.awt.*;  
import javax.swing.*;  

public class LayoutPractice extends JPanel {  
    
    mypannel t = new mypannel();

    public class mypannel extends JFrame {

        public mypannel(){
            setTitle("My Layout Practice");
            setSize(500, 500);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE); 

            JButton b1 =new JButton("Button 1");     
            b1.setBounds(50,100,80,30);    
            b1.setBackground(Color.white);     
        }

        public void paint(Graphics g){

            // Drawing a Rectangle
            g.setColor(Color.BLACK);
            g.fillRect(10, 10, 500, 5000);
            
            // Drawing a Circles 
            double a_double = 10;

            for(int a = 10; a > 0; a--){

                g.setColor(Color.YELLOW);
                g.fillOval(250-(a*25)/2, 250-(a*25)/2, a*25, a*25); 

                if (a_double/2 == a/2){
                    g.setColor(Color.RED);
                    g.fillOval(250-(a*25)/2, 250-(a*25)/2, a*25, a*25); 
                }
                a_double = a_double -1;
            }
        }
    } 
    
    
    LayoutPractice(){  
        JFrame f= new JFrame("Panel Example");    
        JPanel panel =new JPanel();  
        panel.setBounds(40,80,500,500);    
        panel.setBackground(Color.BLACK);  
        JButton b1 =new JButton("Button 1");     
        b1.setBounds(50,100,80,30);    
        b1.setBackground(Color.white);     
        panel.add(b1); 
        f.add(panel);  
        f.setSize(400,400);    
        f.setLayout(null);    
                f.setVisible(true);    
    }

    public static void main(String args[]){  
        new LayoutPractice();  
    }  


}  