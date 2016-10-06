package laba2.enumeration.table;


import laba2.enumeration.view.ConstForView;

public enum TeacherColumnNames {
    ID(ConstForView.ID),
    FIO(ConstForView.FIO),
    BERTHDAY(ConstForView.BERTHDAY),
    SEX(ConstForView.SEX),
    EDUCATION(ConstForView.EDUCATION),
    TYPE(ConstForView.TYPE);

    private String name;

    TeacherColumnNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
