package laba2.enumeration.view;


public enum TeacherEducation {
    ВЫС(ConstForView.HIGER),
    СР(ConstForView.SECONDARY),
    БЗ(ConstForView.WITHOUT_EDUCATION),
    СРСПЕЦ(ConstForView.SECONDARY_SPECIAL);

    private String name;

    TeacherEducation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
