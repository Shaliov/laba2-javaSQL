package laba2.enumeration.table;


import laba2.enumeration.view.ConstForView;

public enum  CourseColumnNames {
    ID(ConstForView.ID),
    NAME(ConstForView.NAME),
    TYPE(ConstForView.TYPE),
    TRAINING_DAYS(ConstForView.TRAINING_DAYS),
    NUMBER_OF_GROUP(ConstForView.NUMBER_OF_GROUP),
    PRICE(ConstForView.PRICE),
    PRICE_NDS(ConstForView.PRICE_NDS);

    private String name;

    CourseColumnNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
