package laba2.enumeration.view;


public enum TeacherSex {
    МУЖ("мужской"),
    ЖЕН("женский");

    private String name;

    TeacherSex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
