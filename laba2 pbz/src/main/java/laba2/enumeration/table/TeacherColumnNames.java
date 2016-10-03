package laba2.enumeration.table;


public enum TeacherColumnNames {
    ID("id"),
    FIO("ФИО"),
    BERTHDAY("День рождения"),
    SEX("пол"),
    EDUCATION("образование"),
    TYPE("тип");

    private String name;

    TeacherColumnNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
