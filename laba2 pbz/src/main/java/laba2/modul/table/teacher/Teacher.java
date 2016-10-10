package laba2.modul.table.teacher;


import laba2.enumeration.view.TeacherEducation;
import laba2.enumeration.view.TeacherSex;
import laba2.enumeration.view.TeacherType;

import java.util.Date;

public class Teacher {
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private String fio;
    private Date dateOfBerthd;
    private TeacherSex sex;
    private TeacherEducation education;
    private TeacherType type;

    public Teacher(String name, String surname, String middleName, Date dateOfBerthd,
                   TeacherSex sex, TeacherEducation education, TeacherType type) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        fio = name+surname+middleName;
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
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
}
