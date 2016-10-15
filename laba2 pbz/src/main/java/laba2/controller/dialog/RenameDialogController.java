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

    public void renameTeacher(int id, String fio, String date, int sex, int education, int type  ) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.RENAME_TEACHER);
            preparedStatement.setString(1, fio);
            preparedStatement.setString(2, date);
            preparedStatement.setInt(3, sex);
            preparedStatement.setInt(4, education);
            preparedStatement.setInt(5, type);
            preparedStatement.setInt(6, id);
            preparedStatement.execute();

        }
        catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            DBStorage.getInstance().updateTeacherList();
            DBWorker.getInstance().closeConnection();
            teacherTable.fireTableDataChanged();
        }
    }

    public void renameDocument(int id, int courseID, int teacherID, String data, int trainingDay ) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.RENAME_DOCUMENT);
            preparedStatement.setInt(1, courseID);
            preparedStatement.setInt(2, teacherID);
            preparedStatement.setString(3, data);
            preparedStatement.setInt(4, trainingDay);
            preparedStatement.setInt(5, id);
            preparedStatement.execute();

        }
        catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            DBStorage.getInstance().updateDocumentList();
            DBWorker.getInstance().closeConnection();
            documentTable.fireTableDataChanged();
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
