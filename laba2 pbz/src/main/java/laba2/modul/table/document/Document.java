package laba2.modul.table.document;


import laba2.Main;

import java.sql.Date;
import java.util.*;

public class Document {
    private int id;
    private int courseId;
    private int tecaherId;
    private Date startTrainigDate;
    private int courseTrainigDays;

    public Document() {

    }

    public Document(int courseId, int tecaherId, Date startTrainigDate, int courseTrainigDays) {
        this.courseId = courseId;
        this.tecaherId = tecaherId;
        this.startTrainigDate = startTrainigDate;
        this.courseTrainigDays = courseTrainigDays;

    }

    public Object get(int index) {
        switch (index) {
            case 0:
                return getId();
            case 1:
                return getCourseId();
            case 2:
                return getTecaherId();
            case 3:
                return getStartTrainigDate();
            case 4:
                return getCourseTrainigDays();
            default:
                return "";
        }
    }

    public int getCourseId() {
        return courseId;
    }

    public int getTecaherId() {
        return tecaherId;
    }

    public Date getStartTrainigDate() {
        return startTrainigDate;
    }

    public int getCourseTrainigDays() {
        return courseTrainigDays;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setTecaherId(int tecaherId) {
        this.tecaherId = tecaherId;
    }

    public void setStartTrainigDate(Date startTrainigDate) {
        this.startTrainigDate = startTrainigDate;
    }

    public void setCourseTrainigDays(int courseTrainigDays) {
        this.courseTrainigDays = courseTrainigDays;
    }
}
