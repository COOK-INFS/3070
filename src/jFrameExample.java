import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class jFrameExample {

	public static void main(String[] args) {

		JFrame frame = new JFrame(); // Creating a frame
		frame.setVisible(true); // Makes the frame visible onscreen
		frame.setSize(500, 500);
		frame.setTitle("My first UI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This closes on X
		frame.setResizable(false);
		
		ImageIcon image = new ImageIcon("C:\\Users\\rcook2\\OneDrive - University of Colorado Colorado Springs\\INFS3070\\DWIRE122-Podium-Git\\3070\\src\\images\\UCCS_LionIcon.jpg");
		frame.setIconImage(image.getImage()); // Changes the icon of the JFrame
		
		frame.getContentPane().setBackground(new Color(0xCAF4DF));
		
		

	}

}
