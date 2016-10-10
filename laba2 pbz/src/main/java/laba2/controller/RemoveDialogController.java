package laba2.controller;


import laba2.enumeration.SQL.ConstForCourse;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.dataBase.DBWorker;
import laba2.modul.table.course.CourseTable;
import laba2.modul.table.document.DocumentTable;
import laba2.modul.table.organisation.Organisation;
import laba2.modul.table.organisation.OrganisationTable;
import laba2.modul.table.price.PriceTable;
import laba2.modul.table.teacher.TeacherTable;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveDialogController {
    private CourseTable courseTable;
    private DocumentTable documentTable;
    private TeacherTable teacherTable;
    private OrganisationTable organisationTable;
    private PriceTable priceTable;

    public RemoveDialogController() {
    }

    public void removeCourse(int id) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForCourse.DELETE_FROM_COURSE);
            preparedStatement.setInt(1, id);
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

    public void setTeacherTable(TeacherTable teacherTable) {
        this.teacherTable = teacherTable;
    }

    public void setOrganisationTable(OrganisationTable organisationTable) {
        this.organisationTable = organisationTable;
    }

    public void setPriceTable(PriceTable priceTable) {
        this.priceTable = priceTable;
    }

    public void setCourseTable(CourseTable courseTable) {

        this.courseTable = courseTable;
    }
}
