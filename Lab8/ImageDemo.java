import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class ImageDemo {
    
    public static class ImagePanel extends JPanel {

        private BufferedImage image;

        public ImagePanel(String imageName) {
            // Using ClassLoader can find a resource in jar, too.
            ClassLoader cl = getClass().getClassLoader();
            InputStream in = cl.getResourceAsStream(imageName);
            try {
                image = ImageIO.read(in);
                setPreferredSize(new Dimension(image.getWidth(null),
                                               image.getHeight(null)));
            } catch (IOException ex) {
                System.err.println("Error loading: " + imageName);
            }
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JFrame frame = new JFrame("Image Demo");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    frame.add(new ImagePanel("ralph.jpg"));
                    frame.pack();
                    frame.setVisible(true);
                }
            });
    }
}
