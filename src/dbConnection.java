import java.sql.*;
 
public class dbConnection {
 
    public static Connection connection() {
        
        // Create and initialize variables to connect to database
                    String url = "jdbc:mysql://localhost/INFS3070";
                    String user = "infsclass";
                    String password = "webclass";
                    Connection conn = null;
                    
                    // Database connection
                    try {
                        conn = DriverManager.getConnection(url, user, password);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    
                    // Just for esthetics
                    System.out.println("Connection to database created.");
                    System.out.println("------------------------------------------------------");
                    
                    // Since we set the type to Connection and not void we must return something
                    return conn;
    }
 
}
