package laba2.view.frame.Dialog.course;


import laba2.controller.RemoveDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.table.course.CourseTable;
import laba2.view.fields.FieldsCourse;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveDialogCourseTable extends JFrame {
    private FieldsCourse fieldsCourse;
    private RemoveDialogController removeDialogController;

    public RemoveDialogCourseTable(CourseTable courseTable) {
        setName("данные для удаления");

        Box box = Box.createVerticalBox();
        fieldsCourse = new FieldsCourse();

        fieldsCourse.courseID(box);

        okCancle(box);

        removeDialogController = new RemoveDialogController();
        removeDialogController.setCourseTable(courseTable);

        box.setBorder(new EmptyBorder(12, 12, 12, 12));
        setContentPane(box);
        pack();
        setResizable(false);
        setPreferredSize(new Dimension(600, box.getHeight()));
        setSize(new Dimension(400, box.getHeight() + 20));
    }

    private void okCancle(Box box) {
        Box okBox = Box.createHorizontalBox();
        JButton okButton = new JButton(ConstForView.OK);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!fieldsCourse.getIdJTextField().getText().equals("")) {
                    removeDialogController.removeCourse(Integer.parseInt(fieldsCourse.getIdJTextField().getText()));
                    fieldsCourse.getIdJTextField().setText("");
                }

            }
        });
        JButton cancelButton = new JButton(ConstForView.CLOSE);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fieldsCourse.getIdJTextField().setText("");
                dispose();
            }
        });


        okBox.add(Box.createHorizontalGlue());
        okBox.add(okButton);
        okBox.add(Box.createHorizontalStrut(12));
        okBox.add(cancelButton);
        box.add(okBox);
        box.add(Box.createVerticalStrut(12));
        box.add(Box.createHorizontalStrut(24));
    }
}