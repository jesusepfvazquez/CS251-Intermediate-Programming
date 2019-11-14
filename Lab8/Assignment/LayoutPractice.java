import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Jesus Vazquez
 * Due 11/12/2018
 * 
 */

/**
 * The LayoutPractice will implement ActionListener and extend JFrame to create a window that will
 * have a bunch of red and yellow circles. There will be a button that you click and you will get 
 * a dialog box saying the number of times you had clicked the button. For this code to work you need 
 * to create a JComponent which I called Circles. You first need to run Circles.java
 */
public class LayoutPractice extends JFrame implements ActionListener {

    int myclicks = 0;
    JLabel label = new JLabel("Buttons clicks=" + myclicks);

    public static void main(String[] args) {
        LayoutPractice myframe = new LayoutPractice();
        myframe.setBounds(400, 400, 100, 100);
        myframe.setSize(600, 600);
        myframe.setTitle("Layout Practice");
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);
    }

    public LayoutPractice() {
        JComponent component = new Circles();

        JButton button = new JButton("Click me for a dialog");

        JPanel leftPanel = new JPanel();
        leftPanel.add(component);
        JPanel rightPanel = new JPanel();
        rightPanel.add(label);
        rightPanel.add(button);
        add(component, BorderLayout.CENTER);
        add(label, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        myclicks++;
        label.setText("Buttons Clicks = " + myclicks);
        JOptionPane.showMessageDialog(null, "You have clicked " + myclicks + " times");
    }

}

