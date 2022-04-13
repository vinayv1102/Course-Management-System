package coursemanagement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//javac -d . Account.java Administrator.java Course.java Database.java Instructor.java Main.java Module.java Student.java
//java -cp .;C:\Users\vinay\OneDrive\Desktop\mysql-connector-java-8.0.27.jar coursemanagement.Main

public class Database {

    private final static String className = "oracle.jdbc.driver.OracleDriver";
    private final static String url = "jdbc:mysql://localhost:3306/coursemanagement";
    private final static String user = "root";
    private final static String password = "12345";
    private static Connection connection;

    /**
     * Returns the database connection.
     *
     * @return database connection
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection getConnection() {
        if (connection == null) {
            try {
//          Class.forName("com.mysql.jdbc.Driver");  
                connection = DriverManager.getConnection(url, user, password);
//            } catch (ClassNotFoundException ex) {
//                ex.printStackTrace();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return connection;
    }
}

