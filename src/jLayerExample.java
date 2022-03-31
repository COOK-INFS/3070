import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class jLayerExample {

	public static void main(String[] args) {

		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.gray);
		label1.setBounds(25,25, 250, 250);
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
		label2.setBounds(50,50, 250, 250);
		
		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.cyan);
		label3.setBounds(75,75, 250, 250);
		
		JLayeredPane layeredPane = new JLayeredPane(); // New instance of JLayered Pane Object
		// Creating layered pane
		layeredPane.setBounds(0,0, 500, 500);
		
		layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label2, JLayeredPane.MODAL_LAYER);
		layeredPane.add(label3, Integer.valueOf(500));
		
		JFrame frame = new JFrame("JLayeredPane");
		frame.add(layeredPane);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(null);
		frame.setVisible(true);

	}

}
