package laba2.view.box;


import laba2.controller.CourseController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.table.course.CourseTable;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDBarCourse extends Box {
    private CourseController courseController;
    public CRUDBarCourse(CourseController courseController)
    {
        super(0);
        this.courseController = courseController;
    }

    public void addCourse() {
        JButton newEntry = new JButton(ConstForView.ADD);
        newEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                courseController.newAddDialogCourseTable();
            }
        });

        add(newEntry);

    }

    public void removeCourse() {
        JButton removeEntry = new JButton(ConstForView.REMOVE);
        removeEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                courseController.removeDialogCourseTable();
            }
        });
        add(removeEntry);
    }
    
    public void renameCourse() {
        JButton renameEntry = new JButton(ConstForView.RENAME);
        renameEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                courseController.renameDialogCourseTable();
            }
        });
        add(renameEntry);
    }
}
