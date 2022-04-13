import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class test{
public static void main(String[] args)
{
    String url = "jdbc:mysql://localhost:3306/coursemanagement";
    String username = "root";
    String password = "12345";

    System.out.println("Loading driver...");

    try {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded!");
    } catch (ClassNotFoundException e) {
        throw new IllegalStateException("Cannot find the driver in the classpath!", e);
    }
    
    System.out.println("Connecting database...");

    try(Connection connection = DriverManager.getConnection(url, username, password)) {
        System.out.println("Database connected!");
    } catch(SQLException e) {
        throw new IllegalStateException("Cannot connect the database!", e);
    }
}
}