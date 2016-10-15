package laba2.view.box;


import laba2.controller.TeacherController;
import laba2.enumeration.view.ConstForView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDBarTeacher extends Box {
        private TeacherController teacherController;

        public CRUDBarTeacher(TeacherController teacherController)
        {
            super(0);
            this.teacherController = teacherController;
        }

    public void addTeacher() {
        JButton newEntry = new JButton(ConstForView.ADD);
        newEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherController.newAddDialogTeacherTable();
            }
        });

        add(newEntry);

    }

    public void removeTeacher() {
        JButton removeEntry = new JButton(ConstForView.REMOVE);
        removeEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherController.removeDialogTeacherTable();
            }
        });
        add(removeEntry);
    }

    public void renameTeacher() {
        JButton renameEntry = new JButton(ConstForView.RENAME);
        renameEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teacherController.renameDialogCourseTable();
            }
        });
        add(renameEntry);
    }
}
