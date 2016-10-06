package laba2.enumeration.table;


import laba2.enumeration.view.ConstForView;

public enum DocumentColumnNames {
    ID_COURSE(ConstForView.ID_COURSE),
    ID_TEACHER(ConstForView.ID_TEACHER),
    START_TRAINING_DAYS(ConstForView.START_TRAINING_DAYS),
    TRAINING_DAYS(ConstForView.TRAINING_DAYS);

    private String name;

    DocumentColumnNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
