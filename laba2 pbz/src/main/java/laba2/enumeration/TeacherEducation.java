package laba2.enumeration;


public enum TeacherEducation {
    ВЫС("высшее"),
    СР("среднее"),
    БЗ("без образования"),
    СРСПЕЦ("средне специальное");

    private String name;

    TeacherEducation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
