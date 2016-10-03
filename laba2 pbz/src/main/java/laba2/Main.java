package laba2;


import laba2.modul.dataBase.DBWorker;
import laba2.view.frame.StartFrame;

import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

//        try {
//            DBWorker.getInstance().openConnection();
//            Statement statement = DBWorker.getInstance().getConnection().createStatement();
//            statement.execute("INSERT INTO Organisation (orgName,orgAddress,orgPhone,orgMail) \n" +
//                    " VALUE ('Петя', 'Дом', '+375', 'asd@mail'); ");
//            DBWorker.getInstance().closeConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        StartFrame startFrame = new StartFrame();
        startFrame.setVisible(true);

    }
}
