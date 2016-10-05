package laba2.controller;


import laba2.view.frame.Dialog.AddDialogCourseTable;

public class CourseController {
    private AddDialogCourseTable addDialogCourseTable;
    public CourseController() {
    }

    public void newAddDialogCourseTable() {
        if(addDialogCourseTable == null){
            addDialogCourseTable = new AddDialogCourseTable();
        }
        addDialogCourseTable.setVisible(true);
    }
}
