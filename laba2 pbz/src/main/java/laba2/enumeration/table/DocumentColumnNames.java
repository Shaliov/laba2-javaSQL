package laba2.enumeration.table;


public enum DocumentColumnNames {
    ID_COURSE("ID курса"),
    ID_TEACHER("ID преподавателя"),
    START_TRAINING_DAYS("начало обучения"),
    TRAINING_DAYS("количество дней");

    private String name;

    DocumentColumnNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
