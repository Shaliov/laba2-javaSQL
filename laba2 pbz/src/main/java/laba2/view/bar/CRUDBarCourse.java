package laba2.view.bar;


import laba2.controller.CourseController;
import laba2.view.frame.Dialog.AddDialogCourseTable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDBarCourse extends JToolBar {
    private CourseController courseController;
    public CRUDBarCourse() {
    }

    public void addBar() {
        JButton newEntry = new JButton("добавить");
        newEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                courseController.newAddDialogCourseTable();
            }
        });
        add(newEntry);
    }

    public void setCourseController(CourseController courseController) {
        this.courseController = courseController;
    }
}
