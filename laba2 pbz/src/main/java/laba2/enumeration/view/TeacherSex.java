package laba2.enumeration.view;


public enum TeacherSex {
    МУЖ(ConstForView.MALE),
    ЖЕН(ConstForView.FEMALE);

    private String name;

    TeacherSex(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
