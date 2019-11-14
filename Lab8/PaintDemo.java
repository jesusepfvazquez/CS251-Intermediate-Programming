import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class PaintDemo {

    public static class MyPanel extends JPanel {
        public MyPanel() {
            setPreferredSize(new Dimension(300, 300));
            setBackground(Color.CYAN);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.drawRect(10, 100, 30, 20);
            g.setColor(Color.RED);
            g.fillRect(100, 100, 50, 40);
            g.drawOval(100, 150, 40, 30);
            g.setColor(Color.YELLOW);
            g.fillOval(75, 90, 40, 40);
        }
    }

    private static void createAndShowGUI() {
        final JFrame frame = new JFrame("Paint Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JPanel borderedPanel = new MyPanel();
        Border border = BorderFactory.createTitledBorder("This panel has a border");
        borderedPanel.setBorder(border);

        panel.add(borderedPanel);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
    }

}