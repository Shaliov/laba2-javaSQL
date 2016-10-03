package laba2.enumeration.view;


public enum CourseType {
    ИТ("информационные технологии"),
    М("менеджмент");

    private String name;

    CourseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

