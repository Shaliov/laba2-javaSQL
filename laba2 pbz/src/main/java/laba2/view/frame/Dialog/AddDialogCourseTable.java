package laba2.view.frame.Dialog;


import laba2.view.fields.FieldsCourse;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddDialogCourseTable extends JFrame {
    private FieldsCourse fieldsCourse;

    public AddDialogCourseTable() {
        setName("введите данный о курсах");

        Box box = Box.createVerticalBox();
        fieldsCourse = new FieldsCourse();

        fieldsCourse.courseName(box);
        fieldsCourse.courseType(box);
        fieldsCourse.courseTraningDays(box);
        fieldsCourse.courseNumberOfGroup(box);
        fieldsCourse.coursePrice(box);
        okCancle(box);

        box.setBorder(new EmptyBorder(12, 12, 12, 12));
        setContentPane(box);
        pack();
        setResizable(false);
        setPreferredSize(new Dimension(600, box.getHeight()));
        setSize(new Dimension(400, box.getHeight() + 20));
    }

    private void okCancle(Box box) {
        Box okBox = Box.createHorizontalBox();
        JButton okButton = new JButton("Ok");
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        JButton cancelButton = new JButton("Закрыть");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

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
