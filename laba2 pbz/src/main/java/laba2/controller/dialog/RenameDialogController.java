package laba2.controller.dialog;


import laba2.enumeration.SQL.ConstForSQL;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.dataBase.DBWorker;
import laba2.modul.table.course.CourseTable;
import laba2.modul.table.document.DocumentTable;
import laba2.modul.table.organisation.OrganisationTable;
import laba2.modul.table.price.PriceTable;
import laba2.modul.table.teacher.TeacherTable;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RenameDialogController {
    private CourseTable courseTable;
    private DocumentTable documentTable;
    private TeacherTable teacherTable;
    private OrganisationTable organisationTable;
    private PriceTable priceTable;

    public RenameDialogController() {

    }

    public void renameCourse(int id, String courseName, int courseType , String courseTrainingDays, String courseNumberOfGroup, String price ) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.RENAME_COURSE);
            preparedStatement.setString(1, courseName.toString());
            preparedStatement.setInt(2, courseType);
            preparedStatement.setInt(3, Integer.parseInt(courseTrainingDays));
            preparedStatement.setInt(4, Integer.parseInt(courseNumberOfGroup));
            preparedStatement.setInt(5, Integer.parseInt(price));
            preparedStatement.setDouble(6, Integer.parseInt(price) * 1.20);
            preparedStatement.setInt(7, id);

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

    public void renameOrganisation(int id, String name, String adres, int phone, String mail) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.RENAME_ORGANISATION);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, adres);
            preparedStatement.setInt(3, phone);
            preparedStatement.setString(4, mail);
            preparedStatement.setInt(5, id);
            preparedStatement.execute();

        }
        catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            DBStorage.getInstance().updateOrganisationList();
            DBWorker.getInstance().closeConnection();
            organisationTable.fireTableDataChanged();
        }
    }

    public void renamePrice(int id, String data, int price) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.RENAME_PRICE);
            preparedStatement.setString(1, data);
            preparedStatement.setInt(2, price);
            preparedStatement.setDouble(3, price * 1.20);
            preparedStatement.setInt(4, id);
            preparedStatement.execute();

        }
        catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            DBStorage.getInstance().updatePriceList();
            DBWorker.getInstance().closeConnection();
            priceTable.fireTableDataChanged();
        }
    }

    public void setCourseTable(CourseTable courseTable) {
        this.courseTable = courseTable;
    }

    public void setDocumentTable(DocumentTable documentTable) {
        this.documentTable = documentTable;
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
}
