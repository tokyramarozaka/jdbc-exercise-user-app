package user_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private String userName;
    private String password;
    private String databaseName;
    private Connection connection;

    public ConnectionDB(String userName, String password, String databaseName) {
        this.userName = userName;
        this.password = password;
        this.databaseName = databaseName;
        createConnection();
    }

    private void createConnection() {
        try{
            this.connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost/" + this.databaseName,
                    this.userName,
                    this.password
            );
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public Connection getConnection() {
        return connection;
    }
}
