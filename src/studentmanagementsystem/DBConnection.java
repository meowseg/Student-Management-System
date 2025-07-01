package studentmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            // Loading the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connecting to local MySQL database
            // NOTE: Replace "root" and "Your_Password" with your MySQL username and password
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student_management", 
                "root",              //Username- usually root
                "Your_Password"   // Add your MySQL password here if you have set one
            );

            System.out.println("✅ Connected to database successfully!");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("❌ Connection Failed!");
            e.printStackTrace();
        }

        return conn;
    }
    
    public static void main(String args[]) {
        getConnection();
    }
}




