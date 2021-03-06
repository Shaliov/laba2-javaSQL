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
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.DELETE_FROM_COURSE);
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

    public void removeOrganisation(int id) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.DELETE_FROM_ORGANISATION);
            preparedStatement.setInt(1, id);
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

    public void removePrice(int id) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.DELETE_FROM_PRICE);
            preparedStatement.setInt(1, id);
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

    public void removeTeacher(int id) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.DELETE_FROM_TEACER);
            preparedStatement.setInt(1, id);
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

    public void removeDocument(int id) {
        try {
            DBWorker.getInstance().openConnection();
            PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForSQL.DELETE_FROM_DOCUMENT);
            preparedStatement.setInt(1, id);
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

    public void setDocumentTable(DocumentTable documentTable) {
        this.documentTable = documentTable;
    }
}
