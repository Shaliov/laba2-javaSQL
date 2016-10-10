package laba2.controller;


import laba2.enumeration.SQL.ConstForCourse;
import laba2.modul.dataBase.DBWorker;
import laba2.modul.table.course.Course;

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
            ResultSet resultSet = statement.executeQuery(ConstForCourse.SELECT_ALL_FROM_COURSE);
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
}
