package laba2.view.frame.Dialog.course;


import laba2.controller.dialog.RenameDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.enumeration.view.CourseType;
import laba2.modul.table.course.CourseTable;
import laba2.view.fields.FieldsCourse;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RenameDialog extends JFrame {
    private FieldsCourse fieldsCourse;
    private RenameDialog renameDialogCourseTable;
    private RenameDialogController renameDialogController;
    private int id;

    public RenameDialog(CourseTable courseTable) {
        setName("данные для редоктирования");
        renameDialogCourseTable = this;
        Box box = Box.createVerticalBox();

        fieldsCourse = new FieldsCourse();

        fieldsCourse.courseName(box);
        fieldsCourse.courseType(box);
        fieldsCourse.courseTraningDays(box);
        fieldsCourse.courseNumberOfGroup(box);
        fieldsCourse.coursePrice(box);

        okCancle(box);

        renameDialogController = new RenameDialogController();
        renameDialogController.setCourseTable(courseTable);

        box.setBorder(new EmptyBorder(12, 12, 12, 12));
        setContentPane(box);
        pack();
        setResizable(false);
        setPreferredSize(new Dimension(600, box.getHeight()));
        setSize(new Dimension(400, box.getHeight() + 20));
    }

//    public void find() {
//        try {
//            id = Integer.parseInt(JOptionPane.showInputDialog("id:").trim());
//            for (Course course : DBStorage.getInstance().getCourseList()) {
//                if (course.getId() == id) {
//                    fieldsCourse.getNameJTextField().setText(course.getName());
//                    fieldsCourse.getCourseTrainingDaysJTextField().setText(String.valueOf(course.getTrainingDays()));
//                    fieldsCourse.getCourseTypeJComboBox().setSelectedItem(course.getType());
//                    fieldsCourse.getCourseNumberOfGroupJTextField().setText(String.valueOf(course.getNumberOfGroup()));
//                    fieldsCourse.getPriceJTextField().setText(String.valueOf(course.getPrice()));
//                }
//
//            }
//
//        } catch (NullPointerException e) {
//            if (id == 0) {
//                renameDialogCourseTable.dispose();
//            } else {
//                find();
//            }
//        }
//    }

    private void okCancle(Box box) {
        Box okBox = Box.createHorizontalBox();
        JButton okButton = new JButton(ConstForView.OK);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String courseName = fieldsCourse.getNameJTextField().getText();
                String courseTrainingDays = fieldsCourse.getCourseTrainingDaysJTextField().getText();
                int courseType = CourseType.valueOf(fieldsCourse.getCourseTypeJComboBox().getSelectedItem().toString()).getId();
                String courseNumberOfGroup = fieldsCourse.getCourseNumberOfGroupJTextField().getText();
                String price = fieldsCourse.getPriceJTextField().getText();

                id = Integer.parseInt(JOptionPane.showInputDialog("id:").trim());
                renameDialogController.renameCourse(id, courseName, courseType, courseTrainingDays, courseNumberOfGroup, price);
                freeJTextField();
//                find();


            }
        });
        JButton cancelButton = new JButton(ConstForView.CLOSE);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                freeJTextField();
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

    private void freeJTextField() {
        fieldsCourse.getNameJTextField().setText("");
        fieldsCourse.getCourseTrainingDaysJTextField().setText("");
        fieldsCourse.getCourseNumberOfGroupJTextField().setText("");
        fieldsCourse.getPriceJTextField().setText("");
    }
}
