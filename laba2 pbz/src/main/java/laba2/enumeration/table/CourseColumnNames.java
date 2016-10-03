package laba2.enumeration.table;


public enum  CourseColumnNames {
    ID("id"),
    NAME("название"),
    TYPE("тип"),
    TRAINING_DAYS("количсество дней обучения"),
    NUMBER_OF_GROUP("количество обучаемых"),
    PRICE("цена"),
    PRICE_NDS("цена с учётом НДС");

    private String name;

    CourseColumnNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
