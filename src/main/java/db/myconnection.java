
package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public class myconnection {
     public static Connection connect() { 
        String jdbcUrl = "jdbc:mysql://localhost:3306/bfresult";
         String username = "root";
        String password = ""; 
     try { 
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection(jdbcUrl, username, password); 
         System.out.println("connection success");
         return con;
     } 
     catch (ClassNotFoundException e){
         e.printStackTrace(); 
     } 
     catch (SQLException throwables){
         throwables.printStackTrace(); 
     } 
 return null;    
} 
}
