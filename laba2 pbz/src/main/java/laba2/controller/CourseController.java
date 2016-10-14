package laba2.controller;


import laba2.modul.table.course.CourseTable;
import laba2.view.frame.Dialog.course.AddDialog;
import laba2.view.frame.Dialog.course.RemoveDialog;
import laba2.view.frame.Dialog.course.RenameDialog;

public class CourseController {
    private CourseTable courseTable;
    private AddDialog addDialogCourseTable;
    private RemoveDialog removeDialogCourseTable;
    private RenameDialog renameDialogCourseTable;
    public CourseController(CourseTable courseTable) {
        this.courseTable = courseTable;
    }

    public void newAddDialogCourseTable() {
        if(addDialogCourseTable == null){
            addDialogCourseTable = new AddDialog(courseTable);
        }
        addDialogCourseTable.setVisible(true);
    }

    public void removeDialogCourseTable() {
        if(removeDialogCourseTable == null){
            removeDialogCourseTable = new RemoveDialog(courseTable);
        }
        removeDialogCourseTable.setVisible(true);
    }

    public void renameDialogCourseTable() {
        if(renameDialogCourseTable == null){
            renameDialogCourseTable = new RenameDialog(courseTable);
        }
        renameDialogCourseTable.setVisible(true);
//        renameDialogCourseTable.find();
    }
}
