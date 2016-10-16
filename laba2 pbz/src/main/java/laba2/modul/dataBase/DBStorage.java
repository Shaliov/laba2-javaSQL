package laba2.modul.dataBase;


import laba2.controller.DBStorageController;
import laba2.modul.table.course.Course;
import laba2.modul.table.document.Document;
import laba2.modul.table.example.PriceList;
import laba2.modul.table.example.TeacherForCourseBetwenYearsModel;
import laba2.modul.table.organisation.Organisation;
import laba2.modul.table.price.Price;
import laba2.modul.table.teacher.Teacher;
import laba2.view.frame.example.TeacherForCourseBetwenYears;

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
    private List<PriceList> priceListsExample = new ArrayList();
    private List<TeacherForCourseBetwenYearsModel> teacherForCourseBetwenYearses = new ArrayList();


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

    public void updatePriceList() {
        priceList.clear();
        dbStorageController.fillPriceList(priceList);
    }

    public void updateTeacherList() {
        teacherList.clear();
        dbStorageController.fillTeacherList(teacherList);
    }

    public void updateDocumentList() {
        documentList.clear();
        dbStorageController.fillDocumentList(documentList);
    }

    public void updatePriceListExample() {
        priceListsExample.clear();
        dbStorageController.fillPriceListExample(priceListsExample);
    }

    public void updateteacherForCourseBetwenYearseList( String fio, String date1, String date2 ) {
        teacherForCourseBetwenYearses.clear();
        dbStorageController.fillTeacherForCourseBetwenYearsList(teacherForCourseBetwenYearses, fio, date1, date2);
    }

    public List<TeacherForCourseBetwenYearsModel> getTeacherForCourseBetwenYearses() {
        return teacherForCourseBetwenYearses;
    }

    public void setTeacherForCourseBetwenYearses(List<TeacherForCourseBetwenYearsModel> teacherForCourseBetwenYearses) {
        this.teacherForCourseBetwenYearses = teacherForCourseBetwenYearses;
    }

    public List<PriceList> getPriceListsExample() {
        return priceListsExample;
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
