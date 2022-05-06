import java.sql.*;
 
public class dbViewData {
 
    public static void main(String[] args) {
        
        Connection conn = null;
        Statement sqlQuery = null;
        ResultSet results = null;
        
        conn = dbConnection.connection();
        try {
            sqlQuery = conn.createStatement();
         
        
            results = sqlQuery.executeQuery("SELECT * FROM students");
        } catch (SQLException e1) {
            
            e1.printStackTrace();
        }
        
        try {
                        
            // Display results in console
            // We use a while loop to read all of the data
            while (results.next()) {
                
                // Formatting the console output to appear as a table.
                System.out.printf("%s %-15s %-15s %s\n", 
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
