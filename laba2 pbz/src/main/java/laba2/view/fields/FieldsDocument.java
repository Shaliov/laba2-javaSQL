package laba2.view.fields;


import laba2.enumeration.view.ConstForView;

import javax.swing.*;
import java.awt.*;

public class FieldsDocument {
    private JTextField idJTextField;
    private JTextField courseIdJTextField;
    private JTextField teacherIdJTextField;
    private JTextField dayJTextField;
    private JTextField mounthJTextField;
    private JTextField yearJTextField;
    private JTextField courseTrainingDaysJTextField;

    public FieldsDocument() {
    }

    public void docId(Box box){
        Box boxPriceID = Box.createHorizontalBox();
        JLabel priceIDLabel = new JLabel(ConstForView.ID);
        priceIDLabel.setPreferredSize(new Dimension(260, priceIDLabel.getHeight()));
        idJTextField = new JTextField(20);

        boxPriceID.add(priceIDLabel);
        boxPriceID.add(Box.createHorizontalStrut(6));
        boxPriceID.add(idJTextField);
        box.add(boxPriceID);
        box.add(Box.createVerticalStrut(8));
    }

    public void courseID(Box box){
        Box boxCourseID = Box.createHorizontalBox();
        JLabel courseIDLabel = new JLabel(ConstForView.COURSE_ID);
        courseIDLabel.setPreferredSize(new Dimension(260, courseIDLabel.getHeight()));
        courseIdJTextField = new JTextField(20);

        boxCourseID.add(courseIDLabel);
        boxCourseID.add(Box.createHorizontalStrut(6));
        boxCourseID.add(courseIdJTextField);
        box.add(boxCourseID);
        box.add(Box.createVerticalStrut(8));
    }

    public void teacherID(Box box){
        Box boxTeacherID = Box.createHorizontalBox();
        JLabel teacherIDLabel = new JLabel(ConstForView.TEACHER_ID);
        teacherIDLabel.setPreferredSize(new Dimension(260, teacherIDLabel.getHeight()));
        teacherIdJTextField = new JTextField(20);

        boxTeacherID.add(teacherIDLabel);
        boxTeacherID.add(Box.createHorizontalStrut(6));
        boxTeacherID.add(teacherIdJTextField);
        box.add(boxTeacherID);
        box.add(Box.createVerticalStrut(8));
    }

    public void data(Box box){
        Box boxData = Box.createHorizontalBox();
        JLabel dataLabel = new JLabel(ConstForView.YEAR_MOUNTH_DAY);
        dataLabel.setPreferredSize(new Dimension(260, dataLabel.getHeight()));
        dayJTextField = new JTextField(20);
        mounthJTextField = new JTextField(20);
        yearJTextField = new JTextField(20);

        boxData.add(dataLabel);
        boxData.add(Box.createHorizontalStrut(6));
        boxData.add(yearJTextField);
        boxData.add(Box.createHorizontalStrut(6));
        boxData.add(mounthJTextField);
        boxData.add(Box.createHorizontalStrut(6));
        boxData.add(dayJTextField);
        box.add(boxData);
        box.add(Box.createVerticalStrut(8));
    }

    public void traningDays(Box box) {
        Box boxCourseTrainingDays= Box.createHorizontalBox();
        JLabel courseTrainingDaysJLabel = new JLabel(ConstForView.TRAINING_DAYS);
        courseTrainingDaysJLabel.setPreferredSize(new Dimension(210, courseTrainingDaysJLabel.getHeight()));
        courseTrainingDaysJTextField = new JTextField(20);

        boxCourseTrainingDays.add(courseTrainingDaysJLabel);
        boxCourseTrainingDays.add(Box.createHorizontalStrut(6));
        boxCourseTrainingDays.add(courseTrainingDaysJTextField);
        box.add(boxCourseTrainingDays);
        box.add(Box.createVerticalStrut(8));
    }

    public JTextField getIdJTextField() {
        return idJTextField;
    }

    public JTextField getCourseIdJTextField() {
        return courseIdJTextField;
    }

    public JTextField getTeacherIdJTextField() {
        return teacherIdJTextField;
    }

    public JTextField getDayJTextField() {
        return dayJTextField;
    }

    public JTextField getMounthJTextField() {
        return mounthJTextField;
    }

    public JTextField getYearJTextField() {
        return yearJTextField;
    }

    public JTextField getCourseTrainingDaysJTextField() {
        return courseTrainingDaysJTextField;
    }
}
