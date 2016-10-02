package laba2;


import laba2.modul.dataBase.DBWorker;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        try {
            Statement statement = DBWorker.getInstance().getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Organisation");
            while (resultSet.next()) {
               String name = resultSet.getString(2);
                System.out.println(name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
