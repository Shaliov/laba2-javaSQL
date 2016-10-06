package laba2.enumeration.view;


public enum CourseType {
    ИТ(ConstForView.IT),
    М(ConstForView.MANAGER);

    private String name;

    CourseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

