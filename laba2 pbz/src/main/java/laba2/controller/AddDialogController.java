package laba2.controller;


import laba2.enumeration.SQL.ConstForCourse;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.dataBase.DBWorker;
import laba2.modul.table.course.CourseTable;
import laba2.modul.table.document.DocumentTable;
import laba2.modul.table.organisation.OrganisationTable;
import laba2.modul.table.price.PriceTable;
import laba2.modul.table.teacher.TeacherTable;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddDialogController {
    private CourseTable courseTable;
    private TeacherTable teacherTable;
    private OrganisationTable organisationTable;
    private PriceTable priceTable;
    private DocumentTable documentTable;


    public AddDialogController() {
    }

    public void addCourse(String courseName, int courseType , String courseTrainingDays, String courseNumberOfGroup, String price ) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForCourse.INSERT_NEW_COURSE);
            preparedStatement.setString(1, courseName.toString());
            preparedStatement.setInt(2, courseType);
            preparedStatement.setInt(3, Integer.parseInt(courseTrainingDays));
            preparedStatement.setInt(4, Integer.parseInt(courseNumberOfGroup));
            preparedStatement.setInt(5, Integer.parseInt(price));
            preparedStatement.setDouble(6, Integer.parseInt(price) * 1.20);

            preparedStatement.execute();

        }
        catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            DBStorage.getInstance().updateCourseList();
            DBWorker.getInstance().closeConnection();
            courseTable.fireTableDataChanged();
        }
    }

    public void setCourseTable(CourseTable courseTable) {
        this.courseTable = courseTable;
    }

    public void setTeacherTable(TeacherTable teacherTable) {
        this.teacherTable = teacherTable;
    }

    public void setOrganisationTable(OrganisationTable organisationTable) {
        this.organisationTable = organisationTable;
    }

    public void setPriceTable(PriceTable priceTable) {
        this.priceTable = priceTable;
    }

    public void setDocumentTable(DocumentTable documentTable) {
        this.documentTable = documentTable;
    }
}