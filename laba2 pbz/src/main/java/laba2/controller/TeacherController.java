package laba2.controller;


import laba2.modul.table.teacher.TeacherTable;
import laba2.view.frame.Dialog.teacher.AddDialog;
import laba2.view.frame.Dialog.teacher.RemoveDialog;
import laba2.view.frame.Dialog.teacher.RenameDialog;

public class TeacherController {
    private TeacherTable teacherTable;
    private AddDialog addDialogCourseTable;
    private RemoveDialog removeDialogCourseTable;
    private RenameDialog renameDialogCourseTable;

    public TeacherController(TeacherTable teacherTable) {
        this.teacherTable = teacherTable;
    }

    public void newAddDialogTeacherTable() {
        if(addDialogCourseTable == null){
            addDialogCourseTable = new AddDialog(teacherTable);
        }
        addDialogCourseTable.setVisible(true);
    }

    public void removeDialogTeacherTable() {
        if(removeDialogCourseTable == null){
            removeDialogCourseTable = new RemoveDialog(teacherTable);
        }
        removeDialogCourseTable.setVisible(true);
    }

    public void renameDialogCourseTable() {
        if(renameDialogCourseTable == null){
            renameDialogCourseTable = new RenameDialog(teacherTable);
        }
        renameDialogCourseTable.setVisible(true);
    }
}
