import javax.swing.JFrame;
import java.awt.*;

public class tutorial extends JFrame {

    public tutorial(){
        setTitle("My Layout Practice");
        setSize(1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    public void paint(Graphics g){

        // Drawing a Rectangle
        g.setColor(Color.BLACK);
        g.fillRect(10, 10, 5000, 5000);
        
        // Drawing a Circles 
        double a_double = 10;

        for(int a = 10; a > 0; a--){

            g.setColor(Color.YELLOW);
            g.fillOval(500-(a*50)/2, 500-(a*50)/2, a*50, a*50); 


            if (a_double/2 == a/2){
                g.setColor(Color.RED);
                g.fillOval(500-(a*50)/2, 500-(a*50)/2, a*50, a*50); 
            }
            a_double = a_double -1;
        }
    }

    public static void main(String[] args){
        tutorial t = new tutorial();
        t.paint(null);

    }

}