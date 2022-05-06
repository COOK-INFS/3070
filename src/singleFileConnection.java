
import java.sql.*;
 
public class singleFileConnection {
 
    public static void main(String[] args) {
        
        try {
        
	
        
	// Create variables for database connection parameters
            String url = "jdbc:mysql://localhost/INFS3070";
            String user = "infsclass";
            String password = "webclass";
            Connection conn = null;
            Statement sqlQuery = null;
            ResultSet results = null;
            
            // Connect to database using variables
            conn = DriverManager.getConnection(url, user, password); // Different to separate connection file
            
            // Simply for esthetic purposes
            System.out.println("Connection to database created.");
            System.out.println("------------------------------------------------------");
            
            // Create object to execute SQL statements
            sqlQuery = conn.createStatement();
                        
            // Use a String to send the SQL statement to the database
            results = sqlQuery.executeQuery("SELECT * FROM students");
                    
            // Display results in console
            // We use a while loop to read all of the data
            while (results.next()) {
                
                // Formatting the console output to appear as a table.
                System.out.printf("%s %-15s %-15s %s\n", // Formats how the printf data will align
                        results.getString ("StudentID"), 
                        results.getString("LastName"), 
                        results.getString("FirstName"), 
                        results.getString("Email"));
                
            }
            
            // Close database connection
            conn.close();
            System.out.println("-----------------------------------------------------");
            System.out.println("Connection to database closed.");
            
            
            
        } catch (SQLException e) {
            
            e.printStackTrace();
        }    
    
    }
        
}