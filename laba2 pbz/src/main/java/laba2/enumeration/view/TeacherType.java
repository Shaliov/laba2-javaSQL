package laba2.enumeration.view;


public enum TeacherType {
    ВЫС(ConstForView.HIGHEST),
    П(ConstForView.FIRST),
    В(ConstForView.SECOND);

    private String name;

    TeacherType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
