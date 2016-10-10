package laba2.enumeration.view;


public enum TeacherEducation {
    ВЫС(ConstForView.HIGER, 1),
    СР(ConstForView.SECONDARY, 2),
    БЗ(ConstForView.WITHOUT_EDUCATION, 3),
    СРСПЕЦ(ConstForView.SECONDARY_SPECIAL, 4);

    private String name;
    private int id;

    TeacherEducation(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
