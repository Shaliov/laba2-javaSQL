package laba2.controller;


import laba2.view.frame.Dialog.AddDialogCourseTable;
import laba2.view.frame.Dialog.RemoveDialogCourseTable;

public class CourseController {
    private AddDialogCourseTable addDialogCourseTable;
    private RemoveDialogCourseTable removeDialogCourseTable;
    public CourseController() {
    }

    public void newAddDialogCourseTable() {
        if(addDialogCourseTable == null){
            addDialogCourseTable = new AddDialogCourseTable();
        }
        addDialogCourseTable.setVisible(true);
    }

    public void removeDialogCourseTable() {
        if(removeDialogCourseTable == null){
            removeDialogCourseTable = new RemoveDialogCourseTable();
        }
        removeDialogCourseTable.setVisible(true);
    }

}
