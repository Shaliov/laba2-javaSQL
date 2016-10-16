package laba2.modul.table.teacher;


import laba2.enumeration.view.TeacherEducation;
import laba2.enumeration.view.TeacherSex;
import laba2.enumeration.view.TeacherType;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class Teacher {
    private int id;
    private String fio;
    private Date dateOfBerthd;
    private TeacherSex sex;
    private TeacherEducation education;
    private TeacherType type;


    public Teacher() {

    }

    public Teacher(String fio, Date dateOfBerthd,
                   TeacherSex sex, TeacherEducation education, TeacherType type) {
        this.fio = fio;
        this.dateOfBerthd = dateOfBerthd;
        this.sex = sex;
        this.education = education;
        this.type = type;
    }

    public Object get(int index) {
        switch (index) {
            case 0:
                return getId();
            case 1:
                return getFio();
            case 2:
                return getDateOfBerthd();
            case 3:
                return getSex().getName();
            case 4:
                return getEducation().getName();
            case 5:
                return getType().getName();
            default:
                return "";
        }
    }


    public String getFio() {
        return fio;
    }

    public Date getDateOfBerthd() {
        return dateOfBerthd;
    }

    public TeacherSex getSex() {
        return sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TeacherEducation getEducation() {
        return education;
    }

    public TeacherType getType() {
        return type;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setDateOfBerthd(Date dateOfBerthd) {
        this.dateOfBerthd = dateOfBerthd;
    }

    public void setSex(String  name) {
        for(TeacherSex teacherSex : TeacherSex.values()) {
            if(teacherSex.getName().equals(name)) {
                this.sex = teacherSex;
            }
        }
    }

    public void setEducation(String name) {
        for(TeacherEducation teacherEducation : TeacherEducation.values()) {
            if(teacherEducation.getName().equals(name)) {
                this.education = teacherEducation;
            }
        }
    }

    public void setType(String name) {
        for(TeacherType teacherType : TeacherType.values()) {
            if(teacherType.getName().equals(name)) {
                this.type = teacherType;
            }
        }
    }
}
