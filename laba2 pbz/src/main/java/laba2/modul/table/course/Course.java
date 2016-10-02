package laba2.modul.table.course;


import laba2.enumeration.CourseType;

public class Course {
    private int id;
    private String name;
    private CourseType type;
    private int trainingDays;
    private int numberOfGroup;
    private int price;
    private final double priceNDS;

    public Course(String name, CourseType type, int trainingDays, int numberOfGroup, int price) {
        this.name = name;
        this.type = type;
        this.trainingDays = trainingDays;
        this.numberOfGroup = numberOfGroup;
        this.price = price;
        priceNDS = price * 1.20;
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

    public void setId(int id) {
        this.id = id;
    }
}
