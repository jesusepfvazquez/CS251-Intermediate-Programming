package ms;
import javax.swing.JToggleButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sweep extends javax.swing.JFrame {

	/*
	-1: has bomb
	0: not open
	1 -8: number of bombs 
	*/

	final int wid = 9;
	final int hei = 9;
	final int noOfBombs=10;
	JToggleButton[][] blocks = new JToggleButton[hei][wid];
	int [][] blox = new int[hei][wid];
	// ActionListener listen = new ActionListener(){
	// 	public void actionPerformed(ActionEvent e){
	// 	}
	// } ;

	public Sweep(){
		initComponents();
		for(int i =0; i < hei; i++){
			for(int j =0; j < wid; j++){
				blocks[i][j] = new JToggleButton();
				blocks[i][j].setSize(jPanel1.getWidth()/wid, jPanel1.getHeight()/hei);
				jPanel1.add(blocks[i][j]);
				blocks[i][j].setLocation(j*jPanel1.getWidth()/wid, i*jPanel1.getHeight()/hei);
			}
		}
	}

	private void resiz(){
		for(int i =0; i < hei; i++){
			for(int j =0; j < wid; j++){
				blocks[i][j].setSize(jPanel1.getWidth()/wid, jPanel1.getHeight()/hei);
				jPanel1.add(blocks[i][j]);
				blocks[i][j].setLocation(j*jPanel1.getWidth()/wid, i*jPanel1.getHeight()/hei);
			}
		}
	}

	private void jPanel1ComponentResized(java.awt.event.ComponentEvent evt){
		resiz();
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run(){
				new Sweep().setVisible(true);
			}
		});
	}
}