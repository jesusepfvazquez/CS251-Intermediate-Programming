import java.awt.*;
import javax.swing.*;

public class Circles extends JComponent {

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