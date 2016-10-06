package laba2.view.box;


import laba2.controller.CourseController;
import laba2.enumeration.view.ConstForView;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDBarCourse extends Box {
    private CourseController courseController;
    public CRUDBarCourse() {
        super(0);

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


    public void setCourseController(CourseController courseController) {
        this.courseController = courseController;
    }
}
