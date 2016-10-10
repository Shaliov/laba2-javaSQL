package laba2.enumeration.view;


public enum CourseType {
    ИТ(ConstForView.IT, 1),
    М(ConstForView.MANAGER, 2);

    private String name;
    private int id;

    CourseType(String name, int id) {
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

