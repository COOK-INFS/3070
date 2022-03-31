import javax.swing.JOptionPane;

public class firstSwingUI {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		
	    // Convert input to a integer
		JOptionPane.showMessageDialog(null, "You are: " + age + " years old.");
		

	}

}
