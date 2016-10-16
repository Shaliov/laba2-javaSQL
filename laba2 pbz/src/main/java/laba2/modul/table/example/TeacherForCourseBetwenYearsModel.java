package laba2.modul.table.example;


import java.sql.Date;

public class TeacherForCourseBetwenYearsModel {
    private String courseName;
    private Date startTrainingDays;
    private int courseTrainingDays;
    public TeacherForCourseBetwenYearsModel() {
    }

    public Object get(int index) {
        switch (index) {
            case 0:
                return getCourseName();
            case 1:
                return getStartTrainingDays();
            case 2:
                return getCourseTrainingDays();
            default:
                return "";
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public Date getStartTrainingDays() {
        return startTrainingDays;
    }

    public int getCourseTrainingDays() {
        return courseTrainingDays;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStartTrainingDays(Date startTrainingDays) {
        this.startTrainingDays = startTrainingDays;
    }

    public void setCourseTrainingDays(int courseTrainingDays) {
        this.courseTrainingDays = courseTrainingDays;
    }
}
