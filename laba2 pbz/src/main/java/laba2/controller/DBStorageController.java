package laba2.controller;


import laba2.enumeration.SQL.ConstForSQL;
import laba2.modul.dataBase.DBWorker;
import laba2.modul.table.course.Course;
import laba2.modul.table.organisation.Organisation;
import laba2.modul.table.price.Price;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DBStorageController {

    public DBStorageController() {
    }

    public void fillCourseList(List<Course> courseList) {
        try {
            DBWorker.getInstance().openConnection();
            Statement statement = DBWorker.getInstance().getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(ConstForSQL.SELECT_ALL_FROM_COURSE);
            while (resultSet.next()) {
                Course course = new Course();
                course.setId(resultSet.getInt(1));
                course.setName(resultSet.getString(2));
                course.setType(resultSet.getString(3));
                course.setTrainingDays(resultSet.getInt(4));
                course.setNumberOfGroup(resultSet.getInt(5));
                course.setPrice(resultSet.getInt(6));
                course.setPriceNDS(resultSet.getDouble(7));

                courseList.add(course);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBWorker.getInstance().closeConnection();
        }
    }

    public void fillOrganisationList(List<Organisation> organisationList) {
        try {
            DBWorker.getInstance().openConnection();
            Statement statement = DBWorker.getInstance().getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(ConstForSQL.SELECT_ALL_FROM_ORGANISATION);
            while (resultSet.next()) {
                Organisation organisation = new Organisation();
                organisation.setId(resultSet.getInt(1));
                organisation.setName(resultSet.getString(2));
                organisation.setAddress(resultSet.getString(3));
                organisation.setPhone(resultSet.getInt(4));
                organisation.seteMail(resultSet.getString(5));

                organisationList.add(organisation);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBWorker.getInstance().closeConnection();
        }
    }

    public void fillPriceList(List<Price> priceList) {
        try {
            DBWorker.getInstance().openConnection();
            Statement statement = DBWorker.getInstance().getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(ConstForSQL.SELECT_ALL_FROM_PRICE);
            while (resultSet.next()) {
                Price price = new Price();
                price.setId(resultSet.getInt(1));
                price.setDate(resultSet.getDate(2));
                price.setPrice(resultSet.getInt(3));
                price.setPriceNDS(resultSet.getDouble(4));

                priceList.add(price);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBWorker.getInstance().closeConnection();
        }
    }
}
