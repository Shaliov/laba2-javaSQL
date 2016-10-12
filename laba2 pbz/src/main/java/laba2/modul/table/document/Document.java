package laba2.modul.table.document;


import java.util.Date;

public class Document {
    private int id;
    private int courseId;
    private int tecaherId;
    private Date startTrainigDate;
    private int courseTrainigDays;

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
}
