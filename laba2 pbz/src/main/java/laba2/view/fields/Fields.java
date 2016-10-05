package laba2.view.fields;


import laba2.enumeration.view.CourseType;
import laba2.enumeration.view.TeacherEducation;
import laba2.enumeration.view.TeacherSex;
import laba2.enumeration.view.TeacherType;

import javax.swing.*;
import java.awt.*;

public class Fields {
    private JTextField nameJTextField;
    private JTextField secondaryNameJTextField;
    private JTextField middleNameJTextField;
    private JTextField courseTrainingDaysJTextField;
    private JTextField courseNumberOfGroupJTextField;
    private JTextField priceJTextField;
    private JComboBox<CourseType> courseTypeJComboBox;
    private JComboBox<TeacherEducation> teacherEducationJComboBox;
    private JComboBox<TeacherSex> teacherSexJComboBox;
    private JComboBox<TeacherType> teacherTypeJComboBox;

    public Fields() {

    }

    public void course(Box box) {
        Box boxCourseName = Box.createHorizontalBox();
        JLabel courseNameLabel = new JLabel("название курсов");
        courseNameLabel.setPreferredSize(new Dimension(300, courseNameLabel.getHeight())); // ???
        nameJTextField = new JTextField(20);

        boxCourseName.add(courseNameLabel);
        boxCourseName.add(Box.createHorizontalStrut(6));
        boxCourseName.add(nameJTextField);
        box.add(boxCourseName);
        box.add(Box.createVerticalStrut(12));

        Box boxCourseType = Box.createHorizontalBox();
        JLabel courseTypeLabel = new JLabel("тип курсов");
        courseTypeLabel.setPreferredSize(new Dimension(300, courseTypeLabel.getHeight())); // ???
        courseTypeJComboBox = new JComboBox<CourseType>(CourseType.values());

        boxCourseType.add(courseTypeLabel);
        boxCourseType.add(Box.createHorizontalStrut(6));
        boxCourseType.add(courseTypeJComboBox);
        box.add(boxCourseType);
        box.add(Box.createVerticalStrut(12));

        Box boxCourseTrainingDays= Box.createHorizontalBox();
        JLabel courseTrainingDaysJLabel = new JLabel("количество дней обучения");
        courseTrainingDaysJLabel.setPreferredSize(new Dimension(300, courseTrainingDaysJLabel.getHeight())); // ???
        courseTrainingDaysJTextField = new JTextField(20);

        boxCourseTrainingDays.add(courseTrainingDaysJLabel);
        boxCourseTrainingDays.add(Box.createHorizontalStrut(6));
        boxCourseTrainingDays.add(courseTrainingDaysJTextField);
        box.add(boxCourseTrainingDays);
        box.add(Box.createVerticalStrut(12));

        Box boxNumberOfGroup = Box.createHorizontalBox();
        JLabel courseNameOfGroupJLabel = new JLabel("число студентов");
        courseNameOfGroupJLabel.setPreferredSize(new Dimension(300, courseNameOfGroupJLabel.getHeight())); // ???
        courseNumberOfGroupJTextField = new JTextField(20);

        boxNumberOfGroup.add(courseNameOfGroupJLabel);
        boxNumberOfGroup.add(Box.createHorizontalStrut(6));
        boxNumberOfGroup.add(courseNumberOfGroupJTextField);
        box.add(boxNumberOfGroup);
        box.add(Box.createVerticalStrut(12));

        Box boxPrice = Box.createHorizontalBox();
        JLabel priceJLabel = new JLabel("цена");
        priceJLabel.setPreferredSize(new Dimension(300, priceJLabel.getHeight())); // ???
        priceJTextField = new JTextField(20);

        boxNumberOfGroup.add(priceJLabel);
        boxNumberOfGroup.add(Box.createHorizontalStrut(6));
        boxNumberOfGroup.add(priceJTextField);
        box.add(boxPrice);
        box.add(Box.createVerticalStrut(12));
    }

    public JTextField getNameJTextField() {
        return nameJTextField;
    }

    public JTextField getSecondaryNameJTextField() {
        return secondaryNameJTextField;
    }

    public JTextField getMiddleNameJTextField() {
        return middleNameJTextField;
    }

    public JComboBox<CourseType> getCourseTypeJComboBox() {
        return courseTypeJComboBox;
    }

    public JComboBox<TeacherEducation> getTeacherEducationJComboBox() {
        return teacherEducationJComboBox;
    }

    public JComboBox<TeacherSex> getTeacherSexJComboBox() {
        return teacherSexJComboBox;
    }

    public JComboBox<TeacherType> getTeacherTypeJComboBox() {
        return teacherTypeJComboBox;
    }

    public JTextField getCourseTrainingDaysJTextField() {
        return courseTrainingDaysJTextField;
    }

    public JTextField getCourseNumberOfGroupJTextField() {
        return courseNumberOfGroupJTextField;
    }

    public JTextField getPriceJTextField() {
        return priceJTextField;
    }

}
