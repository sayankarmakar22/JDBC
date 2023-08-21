import java.sql.*;

public class Database {
    protected static  Connection connect() {
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/your_database_name";
            String username = "your_username";
            String password = "your_password";
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("connection done !");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;

    }
}
