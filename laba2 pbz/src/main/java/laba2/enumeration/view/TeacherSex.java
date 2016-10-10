package laba2.enumeration.view;


public enum TeacherSex {
    МУЖ(ConstForView.MALE, 1),
    ЖЕН(ConstForView.FEMALE, 2);

    private String name;
    private int id;

    TeacherSex(String name, int id) {
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
