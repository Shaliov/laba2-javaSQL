package laba2.modul.dataBase;


import laba2.controller.DBStorageController;
import laba2.modul.table.course.Course;
import laba2.modul.table.document.Document;
import laba2.modul.table.organisation.Organisation;
import laba2.modul.table.price.Price;
import laba2.modul.table.teacher.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DBStorage {
    private static DBStorage instance = null;
    private DBStorageController dbStorageController;
    private List<Course> courseList = new ArrayList();
    private List<Document> documentList = new ArrayList();
    private List<Organisation> organisationList = new ArrayList();
    private List<Price> priceList = new ArrayList();
    private List<Teacher> teacherList = new ArrayList();

    public DBStorage() {
        dbStorageController = new DBStorageController();
    }

    public static DBStorage getInstance() {
        if(instance == null) {
            instance = new DBStorage();
        }
        return instance;
    }

    public void updateCourseList() {
        courseList.clear();
        dbStorageController.fillCourseList(courseList);
    }

    public void updateOrganisationList() {
        organisationList.clear();
        dbStorageController.fillOrganisationList(organisationList);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Document> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<Document> documentList) {
        this.documentList = documentList;
    }

    public List<Organisation> getOrganisationList() {
        return organisationList;
    }

    public void setOrganisationList(List<Organisation> organisationList) {
        this.organisationList = organisationList;
    }

    public List<Price> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Price> priceList) {
        this.priceList = priceList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

}
