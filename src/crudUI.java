import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class crudUI extends JFrame {

	private JPanel contentPane;
	private JTable studentTbl;
	
	Connection conn = dbConnection.connection();  // Connection to the database
	private JLabel idLbl;
	private JTextField idField;
	private JLabel lNameLbl;
	private JTextField lNameField;
	private JLabel fNameLbl;
	private JTextField fNameField;
	private JLabel mailLbl;
	private JTextField mailField;
	private JButton insertBtn;
	private JButton updateBtn;
	private JButton deleteBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crudUI frame = new crudUI();
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
	public crudUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(239, 72, 594, 492);
		contentPane.add(scrollPane);
		
		studentTbl = new JTable();
		scrollPane.setViewportView(studentTbl);
		studentTbl.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student ID", "Last Name", "First Name", "Email"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JButton fetchBtn = new JButton("Fetch Data");
		fetchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				String query = "SELECT * FROM STUDENTS";  // Query to retrieve information from db
				PreparedStatement pst = conn.prepareStatement(query); // Preparing Java to execute SQL statements
				ResultSet results = pst.executeQuery();  // Executes SQL query and stores return in ResultSet
				
				DefaultTableModel tblModel = (DefaultTableModel) studentTbl.getModel();
				tblModel.setRowCount(0);  // Clears table data each time the button is clicked. 
				
				while (results.next()) {  // Keep looking through database until there is a null row
				
				// Create variables to store column data from db
				String id = String.valueOf(results.getInt("StudentID"));
				String lname = results.getString("LastName");
				String fname = results.getString("FirstName");
				String mail = results.getString("Email");
				
				String tblData[] = {id, lname, fname, mail}; // Store the data returned from the query into an array
				
				tblModel.addRow(tblData);  // Populate the UI table with the data from the tblData array
				
				}
				results.close();
				pst.close();
				
				
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}  
				
			}
		});
		fetchBtn.setBounds(728, 48, 105, 23);
		contentPane.add(fetchBtn);
		
		idLbl = new JLabel("Student ID");
		idLbl.setBounds(10, 92, 72, 23);
		contentPane.add(idLbl);
		
		idField = new JTextField();
		idField.setBounds(107, 93, 96, 20);
		contentPane.add(idField);
		idField.setColumns(10);
		
		lNameLbl = new JLabel("Last Name");
		lNameLbl.setBounds(10, 146, 72, 23);
		contentPane.add(lNameLbl);
		
		lNameField = new JTextField();
		lNameField.setColumns(10);
		lNameField.setBounds(107, 147, 96, 20);
		contentPane.add(lNameField);
		
		fNameLbl = new JLabel("First Name");
		fNameLbl.setBounds(10, 205, 72, 23);
		contentPane.add(fNameLbl);
		
		fNameField = new JTextField();
		fNameField.setColumns(10);
		fNameField.setBounds(107, 206, 96, 20);
		contentPane.add(fNameField);
		
		mailLbl = new JLabel("Email");
		mailLbl.setBounds(10, 260, 72, 23);
		contentPane.add(mailLbl);
		
		mailField = new JTextField();
		mailField.setColumns(10);
		mailField.setBounds(107, 261, 96, 20);
		contentPane.add(mailField);
		
		insertBtn = new JButton("INSERT");
		insertBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String lname = lNameField.getText();
				String fname = fNameField.getText();
				String mail = mailField.getText();
				
				try {
					Statement stmt = conn.createStatement();
					
					String addData = "INSERT INTO STUDENTS (LastName, FirstName, Email) VALUES ('"+lname+"', '"+fname+"', '"+mail+"')";
					
					stmt.execute(addData);
					
					// Clear out form data after insert
					idField.setText("");
					lNameField.setText("");
					fNameField.setText("");
					mailField.setText("");
					
					
					stmt.close();
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		insertBtn.setBounds(114, 326, 89, 23);
		contentPane.add(insertBtn);
		
		updateBtn = new JButton("UPDATE");
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idTxt = idField.getText();
				int id = Integer.parseInt(idTxt);
				String lname = lNameField.getText();
				String fname = fNameField.getText();
				String mail = mailField.getText();
				
				try {
					Statement stmt = conn.createStatement();
					
					String updateData = "UPDATE STUDENTS SET LastName = '"+lname+"' , FirstName = '"+fname+"', Email = '"+mail+"' " + "WHERE StudentID = '"+id+"'";
					
					stmt.execute(updateData);
					
					// Clear out form data after insert
					idField.setText("");
					lNameField.setText("");
					fNameField.setText("");
					mailField.setText("");
					
					
					stmt.close();
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		updateBtn.setBounds(114, 375, 89, 23);
		contentPane.add(updateBtn);
		
		deleteBtn = new JButton("DELETE");
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idTxt = idField.getText();
				int id = Integer.parseInt(idTxt);
				String lname = lNameField.getText();
				String fname = fNameField.getText();
				String mail = mailField.getText();
				
				try {
					Statement delstmt = conn.createStatement();
					
					String deleteData = "DELETE FROM STUDENTS WHERE StudentID = '"+id+"'";
					
					delstmt.execute(deleteData);
					
					// Clear out form data after insert
					idField.setText("");
					lNameField.setText("");
					fNameField.setText("");
					mailField.setText("");
					
					
					delstmt.close();
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		deleteBtn.setForeground(Color.RED);
		deleteBtn.setBounds(114, 541, 89, 23);
		contentPane.add(deleteBtn);
	}

}
