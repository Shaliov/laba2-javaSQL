package laba2.view.frame.Dialog;


import com.sun.corba.se.spi.orbutil.fsm.Input;
import laba2.enumeration.SQL.ConstForCourse;
import laba2.enumeration.view.ConstForView;
import laba2.enumeration.view.CourseType;
import laba2.modul.dataBase.DBWorker;
import laba2.view.fields.FieldsCourse;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


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
        JButton okButton = new JButton(ConstForView.OK);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String courseName = fieldsCourse.getNameJTextField().getText();
                String courseTrainingDays = fieldsCourse.getCourseTrainingDaysJTextField().getText();
                String courseType = CourseType.valueOf(fieldsCourse.getCourseTypeJComboBox().getSelectedItem().toString()).getName();
                String courseNumberOfGroup = fieldsCourse.getCourseNumberOfGroupJTextField().getText();
                String price = fieldsCourse.getPriceJTextField().getText();
                if (courseName.isEmpty() == false &&
                        courseTrainingDays.isEmpty() == false &&
                        courseNumberOfGroup.isEmpty() == false &&
                        price.isEmpty() == false) {
                    try {
                        DBWorker.getInstance().openConnection();
                        PreparedStatement preparedStatement = DBWorker.getInstance().getConnection().prepareStatement(ConstForCourse.INSERT_NEW);
                        preparedStatement.setString(1, courseName.toString());
                        preparedStatement.setInt(2, Integer.parseInt(courseType));
                        preparedStatement.setInt(3, Integer.parseInt(courseTrainingDays));
                        preparedStatement.setInt(4, Integer.parseInt(courseNumberOfGroup));
                        preparedStatement.setInt(5, Integer.parseInt(price));
                        preparedStatement.setDouble(6, Integer.parseInt(price) * 1.20);

                        preparedStatement.execute();

                        DBWorker.getInstance().closeConnection();
                    }
                    catch (SQLException e1) {
                        e1.printStackTrace();
                    } finally {
                        DBWorker.getInstance().closeConnection();
                        }
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
