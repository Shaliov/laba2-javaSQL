package laba2.controller;


import laba2.enumeration.SQL.ConstForSQL;
import laba2.modul.dataBase.DBWorker;
import laba2.modul.table.course.Course;
import laba2.modul.table.document.Document;
import laba2.modul.table.example.PriceList;
import laba2.modul.table.example.TeacherForCourseBetwenYearsModel;
import laba2.modul.table.organisation.Organisation;
import laba2.modul.table.price.Price;
import laba2.modul.table.teacher.Teacher;

import java.sql.PreparedStatement;
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

    public void fillTeacherList(List<Teacher> teacherList) {
        try {
            DBWorker.getInstance().openConnection();
            Statement statement = DBWorker.getInstance().getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(ConstForSQL.SELECT_ALL_FROM_TEACHER);
            while (resultSet.next()) {
                Teacher teacher = new Teacher();
                teacher.setId(resultSet.getInt(1));
                teacher.setFio(resultSet.getString(2));
                teacher.setDateOfBerthd(resultSet.getDate(3));
                teacher.setSex(resultSet.getString(4));
                teacher.setEducation(resultSet.getString(5));
                teacher.setType(resultSet.getString(6));
                teacherList.add(teacher);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBWorker.getInstance().closeConnection();
        }
    }

    public void fillDocumentList(List<Document> documentList) {
        try {
            DBWorker.getInstance().openConnection();
            Statement statement = DBWorker.getInstance().getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(ConstForSQL.SELECT_ALL_FROM_DOCUMENT);
            while (resultSet.next()) {
                Document document = new Document();
                document.setId(resultSet.getInt(1));
                document.setCourseId(resultSet.getInt(2));
                document.setTecaherId(resultSet.getInt(3));
                document.setStartTrainigDate(resultSet.getDate(4));
                document.setCourseTrainigDays(resultSet.getInt(5));
                documentList.add(document);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBWorker.getInstance().closeConnection();
        }
    }

    public void fillPriceListExample(List<PriceList> priceLists) {
        try {
            DBWorker.getInstance().openConnection();
            Statement statement = DBWorker.getInstance().getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(ConstForSQL.SELECT_PRICE_LIST);
            while (resultSet.next()) {
                PriceList priceL = new PriceList();
                priceL.setCourseName(resultSet.getString(1));
                priceL.setCourseTrainingDays(resultSet.getInt(2));
                priceL.setPricePrice(resultSet.getInt(3));
                priceL.setPricePriceNDS(resultSet.getDouble(3));
                priceLists.add(priceL);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBWorker.getInstance().closeConnection();
        }
    }

    public void fillTeacherForCourseBetwenYearsList(List<TeacherForCourseBetwenYearsModel> teacherForCourseBetwenYearsModelList, String fio, String date1, String date2 ) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.SELECT_COURSE_FOR_TEACHER_BWTWEEN);
            preparedStatement.setString(1, fio);
            preparedStatement.setString(2, date1);
            preparedStatement.setString(3, date2);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()) {
                TeacherForCourseBetwenYearsModel teacherForCourseBetwenYearsModel = new TeacherForCourseBetwenYearsModel();
                teacherForCourseBetwenYearsModel.setCourseName(resultSet.getString(1));
                teacherForCourseBetwenYearsModel.setStartTrainingDays(resultSet.getDate(2));
                teacherForCourseBetwenYearsModel.setCourseTrainingDays(resultSet.getInt(3));
                teacherForCourseBetwenYearsModelList.add(teacherForCourseBetwenYearsModel);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBWorker.getInstance().closeConnection();
        }
    }
}
