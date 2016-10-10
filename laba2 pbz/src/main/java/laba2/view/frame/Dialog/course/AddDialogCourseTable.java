package laba2.view.frame.Dialog.course;


import laba2.controller.AddDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.enumeration.view.CourseType;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.course.CourseTable;
import laba2.view.fields.FieldsCourse;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddDialogCourseTable extends JFrame {
    private FieldsCourse fieldsCourse;
    private AddDialogController addDialogController;

    public AddDialogCourseTable(CourseTable courseTable) {
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
        addDialogController = new AddDialogController();
        addDialogController.setCourseTable(courseTable);
    }

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
                if (courseName.isEmpty() == false &&
                        courseTrainingDays.isEmpty() == false &&
                        courseNumberOfGroup.isEmpty() == false &&
                        price.isEmpty() == false) {

                    addDialogController.addCourse(courseName, courseType, courseTrainingDays, courseNumberOfGroup, price);


                    fieldsCourse.getNameJTextField().setText("");
                    fieldsCourse.getCourseTrainingDaysJTextField().setText("");
                    fieldsCourse.getCourseNumberOfGroupJTextField().setText("");
                    fieldsCourse.getPriceJTextField().setText("");

                    } else {
                    fieldsCourse.getNameJTextField().setText("");
                    fieldsCourse.getCourseTrainingDaysJTextField().setText("");
                    fieldsCourse.getCourseNumberOfGroupJTextField().setText("");
                    fieldsCourse.getPriceJTextField().setText("");
                }


                }
            }

            );
            JButton cancelButton = new JButton(ConstForView.CLOSE);
            cancelButton.addActionListener(new

            ActionListener() {
                public void actionPerformed (ActionEvent e){
                    fieldsCourse.getNameJTextField().setText("");
                    fieldsCourse.getCourseTrainingDaysJTextField().setText("");
                    fieldsCourse.getCourseNumberOfGroupJTextField().setText("");
                    fieldsCourse.getPriceJTextField().setText("");
                    DBStorage.getInstance().updateCourseList();

                    dispose();
                }
            }

            );


            okBox.add(Box.createHorizontalGlue());
            okBox.add(okButton);
            okBox.add(Box.createHorizontalStrut(12));
            okBox.add(cancelButton);
            box.add(okBox);
            box.add(Box.createVerticalStrut(12));
            box.add(Box.createHorizontalStrut(24));
        }
    }
