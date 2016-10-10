package laba2.modul.table.course;


import laba2.enumeration.view.CourseType;

import java.util.List;

public class Course {
    private int id;
    private String name;
    private CourseType type;
    private int trainingDays;
    private int numberOfGroup;
    private int price;
    private double priceNDS;
    private static final double NDS = 1.20;

    public Course() {
    }

    public Course(String name, CourseType type, int trainingDays, int numberOfGroup, int price) {
        this.name = name;
        this.type = type;
        this.trainingDays = trainingDays;
        this.numberOfGroup = numberOfGroup;
        this.price = price;
        priceNDS = price * NDS;
    }

    public Object get(int index) {
        switch (index) {
            case 0:
                return getId();
            case 1:
                return getName();
            case 2:
                return getType().getName();
            case 3:
                return getTrainingDays();
            case 4:
                return getNumberOfGroup();
            case 5:
                return getPrice();
            case 6:
                return getPriceNDS();
            default:
                return "";
        }
    }


    public String getName() {
        return name;
    }

    public CourseType getType() {
        return type;
    }

    public int getTrainingDays() {
        return trainingDays;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public int getPrice() {
        return price;
    }

    public double getPriceNDS() {
        return priceNDS;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public void setType(String name) {
        for(CourseType courseType: CourseType.values()) {
            if(courseType.getName().equals(name)) {
                this.type = courseType;
            }
        }
    }

    public void setTrainingDays(int trainingDays) {
        this.trainingDays = trainingDays;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPriceNDS(double priceNDS) {
        this.priceNDS = priceNDS;
    }

    public void setId(int id) {
        this.id = id;
    }

}
