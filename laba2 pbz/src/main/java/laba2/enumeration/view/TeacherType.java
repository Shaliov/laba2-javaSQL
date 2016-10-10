package laba2.enumeration.view;


public enum TeacherType {
    ВЫС(ConstForView.HIGHEST, 1),
    П(ConstForView.FIRST, 2),
    В(ConstForView.SECOND, 3);

    private String name;
    private int id;

    TeacherType(String name, int id) {
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
