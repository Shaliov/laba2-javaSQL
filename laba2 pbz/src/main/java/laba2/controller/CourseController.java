package laba2.controller;


import laba2.modul.table.course.CourseTable;
import laba2.view.frame.Dialog.course.AddDialogCourseTable;
import laba2.view.frame.Dialog.course.RemoveDialogCourseTable;
import laba2.view.frame.Dialog.course.RenameDialogCourseTable;

public class CourseController {
    private CourseTable courseTable;
    private AddDialogCourseTable addDialogCourseTable;
    private RemoveDialogCourseTable removeDialogCourseTable;
    private RenameDialogCourseTable renameDialogCourseTable;
    public CourseController(CourseTable courseTable) {
        this.courseTable = courseTable;
    }

    public void newAddDialogCourseTable() {
        if(addDialogCourseTable == null){
            addDialogCourseTable = new AddDialogCourseTable(courseTable);
        }
        addDialogCourseTable.setVisible(true);
    }

    public void removeDialogCourseTable() {
        if(removeDialogCourseTable == null){
            removeDialogCourseTable = new RemoveDialogCourseTable(courseTable);
        }
        removeDialogCourseTable.setVisible(true);
    }

    public void renameDialogCourseTable() {
        if(renameDialogCourseTable == null){
            renameDialogCourseTable = new RenameDialogCourseTable(courseTable);
        }
        renameDialogCourseTable.find();
        renameDialogCourseTable.setVisible(true);
    }


}
