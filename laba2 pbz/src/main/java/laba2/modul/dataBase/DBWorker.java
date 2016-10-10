package laba2.modul.dataBase;

import java.sql.*;

public class DBWorker {
    private static DBWorker instance = null;
    private static final String URL = "jdbc:mysql://localhost:3306/laba2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234asdqwe";

    private Connection connection;

    public DBWorker() {
    }

    public void openConnection() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DBWorker getInstance() {
        if(instance == null) {
            instance = new DBWorker();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

}
