package images;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myFirstJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField fName;
	private JTextField lName;
	private JLabel welcomeBox;  // Must be a global variable

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myFirstJFrame frame = new myFirstJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public myFirstJFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(myFirstJFrame.class.getResource("/images/UCCS_LionIcon.jpg")));
		setTitle("My First UI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setBounds(10, 26, 75, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name: ");
		lblNewLabel_1.setBounds(10, 51, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		fName = new JTextField();
		fName.setToolTipText("Please enter your first name.");
		fName.setBounds(89, 23, 86, 20);
		contentPane.add(fName);
		fName.setColumns(10);
		
		lName = new JTextField();
		lName.setToolTipText("Please enter your last name.");
		lName.setBounds(89, 48, 86, 20);
		contentPane.add(lName);
		lName.setColumns(10);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = fName.getText();
				String lastName = lName.getText();
				welcomeBox.setText("Welcome " + firstName + " " + lastName);
				
			}
		});
		btnSubmit.setBounds(198, 47, 89, 23);
		contentPane.add(btnSubmit);
	
		
		welcomeBox = new JLabel("");
		welcomeBox.setFont(new Font("Tahoma", Font.PLAIN, 28));
		welcomeBox.setBounds(10, 115, 414, 44);
		contentPane.add(welcomeBox);
	}
}
