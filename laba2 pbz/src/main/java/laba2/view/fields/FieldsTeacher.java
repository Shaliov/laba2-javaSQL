package laba2.view.fields;


import laba2.enumeration.view.*;

import javax.swing.*;
import java.awt.*;

public class FieldsTeacher {
    private JTextField idJTextField;
    private JTextField nameJTextField;
    private JTextField surnameJTextField;
    private JTextField middlenameJTextField;
    private JTextField dayJTextField;
    private JTextField mounthJTextField;
    private JTextField yearJTextField;
    private JComboBox<TeacherSex> teacherSexJComboBox;
    private JComboBox<TeacherEducation> teacherEducationJComboBox;
    private JComboBox<TeacherType> teacherTypeJComboBox;

    public FieldsTeacher() {

    }

    public void teacherID(Box box){
        Box boxTeacherID = Box.createHorizontalBox();
        JLabel teacherIDLabel = new JLabel(ConstForView.ID);
        teacherIDLabel.setPreferredSize(new Dimension(260, teacherIDLabel.getHeight()));
        idJTextField = new JTextField(20);

        boxTeacherID.add(teacherIDLabel);
        boxTeacherID.add(Box.createHorizontalStrut(6));
        boxTeacherID.add(idJTextField);
        box.add(boxTeacherID);
        box.add(Box.createVerticalStrut(8));
    }

    public void teacherFIO(Box box){
        Box boxTeachername = Box.createHorizontalBox();
        JLabel teacherNameJLabel = new JLabel(ConstForView.FIO);
        teacherNameJLabel.setPreferredSize(new Dimension(230, teacherNameJLabel.getHeight()));
        nameJTextField = new JTextField(20);
        surnameJTextField = new JTextField(20);
        middlenameJTextField = new JTextField(20);

        boxTeachername.add(teacherNameJLabel);
        boxTeachername.add(Box.createHorizontalStrut(6));
        boxTeachername.add(surnameJTextField);
        boxTeachername.add(Box.createHorizontalStrut(6));
        boxTeachername.add(nameJTextField);
        boxTeachername.add(Box.createHorizontalStrut(6));
        boxTeachername.add(middlenameJTextField);
        box.add(boxTeachername);
        box.add(Box.createVerticalStrut(8));
    }

    public void date(Box box){
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

    public void teacherSex(Box box) {
        Box boxTeacherSex = Box.createHorizontalBox();
        JLabel teacherSexLabel = new JLabel(ConstForView.SEX);
        teacherSexLabel.setPreferredSize(new Dimension(300, teacherSexLabel.getHeight()));
        teacherSexJComboBox = new JComboBox<TeacherSex>(TeacherSex.values());

        boxTeacherSex.add(teacherSexLabel);
        boxTeacherSex.add(Box.createHorizontalStrut(6));
        boxTeacherSex.add(teacherSexJComboBox);
        box.add(boxTeacherSex);
        box.add(Box.createVerticalStrut(8));
    }

    public void teacherEducation(Box box) {
        Box boxTeacherEducation = Box.createHorizontalBox();
        JLabel teacherEducationLabel = new JLabel(ConstForView.EDUCATION);
        teacherEducationLabel.setPreferredSize(new Dimension(300, teacherEducationLabel.getHeight()));
        teacherEducationJComboBox = new JComboBox<TeacherEducation>(TeacherEducation.values());

        boxTeacherEducation.add(teacherEducationLabel);
        boxTeacherEducation.add(Box.createHorizontalStrut(6));
        boxTeacherEducation.add(teacherEducationJComboBox);
        box.add(boxTeacherEducation);
        box.add(Box.createVerticalStrut(8));
    }

    public void teacherType(Box box) {
        Box boxTeacherType = Box.createHorizontalBox();
        JLabel teacherTypeLabel = new JLabel(ConstForView.TYPE);
        teacherTypeLabel.setPreferredSize(new Dimension(300, teacherTypeLabel.getHeight()));
        teacherTypeJComboBox = new JComboBox<TeacherType>(TeacherType.values());

        boxTeacherType.add(teacherTypeLabel);
        boxTeacherType.add(Box.createHorizontalStrut(6));
        boxTeacherType.add(teacherTypeJComboBox);
        box.add(boxTeacherType);
        box.add(Box.createVerticalStrut(8));
    }

    public JTextField getIdJTextField() {
        return idJTextField;
    }

    public JTextField getNameJTextField() {
        return nameJTextField;
    }

    public JTextField getSurnameJTextField() {
        return surnameJTextField;
    }

    public JTextField getMiddlenameJTextField() {
        return middlenameJTextField;
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

    public JComboBox<TeacherSex> getTeacherSexJComboBox() {
        return teacherSexJComboBox;
    }

    public JComboBox<TeacherEducation> getTeacherEducationJComboBox() {
        return teacherEducationJComboBox;
    }

    public JComboBox<TeacherType> getTeacherTypeJComboBox() {
        return teacherTypeJComboBox;
    }
}
