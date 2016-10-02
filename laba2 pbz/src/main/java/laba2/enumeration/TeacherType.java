package laba2.enumeration;


public enum TeacherType {
    ВЫС("высшая"),
    П("первая"),
    В("вторая");

    private String name;

    TeacherType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
