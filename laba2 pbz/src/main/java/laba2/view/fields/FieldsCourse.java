package laba2.view.fields;


import laba2.enumeration.view.ConstForView;
import laba2.enumeration.view.CourseType;


import javax.swing.*;
import java.awt.*;

public class FieldsCourse {
    private JTextField idJTextField;
    private JTextField nameJTextField;
    private JTextField courseTrainingDaysJTextField;
    private JTextField courseNumberOfGroupJTextField;
    private JTextField priceJTextField;
    private JTextField priceNDSJTextField;
    private JComboBox<CourseType> courseTypeJComboBox;

    public FieldsCourse() {

    }

    public void courseID(Box box){
        Box boxCourseID = Box.createHorizontalBox();
        JLabel courseIDLabel = new JLabel(ConstForView.ID);
        courseIDLabel.setPreferredSize(new Dimension(260, courseIDLabel.getHeight())); // ???
        idJTextField = new JTextField(20);

        boxCourseID.add(courseIDLabel);
        boxCourseID.add(Box.createHorizontalStrut(6));
        boxCourseID.add(idJTextField);
        box.add(boxCourseID);
        box.add(Box.createVerticalStrut(8));
    }

    public void courseName(Box box){
        Box boxCourseName = Box.createHorizontalBox();
        JLabel courseNameLabel = new JLabel(ConstForView.NAME_COURSE);
        courseNameLabel.setPreferredSize(new Dimension(230, courseNameLabel.getHeight())); // ???
        nameJTextField = new JTextField(20);

        boxCourseName.add(courseNameLabel);
        boxCourseName.add(Box.createHorizontalStrut(6));
        boxCourseName.add(nameJTextField);
        box.add(boxCourseName);
        box.add(Box.createVerticalStrut(8));
    }
    public void courseType(Box box) {
        Box boxCourseType = Box.createHorizontalBox();
        JLabel courseTypeLabel = new JLabel(ConstForView.COURSE_TYPE);
        courseTypeLabel.setPreferredSize(new Dimension(300, courseTypeLabel.getHeight())); // ???
        courseTypeJComboBox = new JComboBox<CourseType>(CourseType.values());

        boxCourseType.add(courseTypeLabel);
        boxCourseType.add(Box.createHorizontalStrut(6));
        boxCourseType.add(courseTypeJComboBox);
        box.add(boxCourseType);
        box.add(Box.createVerticalStrut(8));
    }
    public void courseTraningDays(Box box) {
        Box boxCourseTrainingDays= Box.createHorizontalBox();
        JLabel courseTrainingDaysJLabel = new JLabel(ConstForView.TRAINING_DAYS);
        courseTrainingDaysJLabel.setPreferredSize(new Dimension(210, courseTrainingDaysJLabel.getHeight())); // ???
        courseTrainingDaysJTextField = new JTextField(20);

        boxCourseTrainingDays.add(courseTrainingDaysJLabel);
        boxCourseTrainingDays.add(Box.createHorizontalStrut(6));
        boxCourseTrainingDays.add(courseTrainingDaysJTextField);
        box.add(boxCourseTrainingDays);
        box.add(Box.createVerticalStrut(8));
    }
    public void courseNumberOfGroup(Box box) {
        Box boxNumberOfGroup = Box.createHorizontalBox();
        JLabel courseNameOfGroupJLabel = new JLabel(ConstForView.NUMBER_OF_GROUP);
        courseNameOfGroupJLabel.setPreferredSize(new Dimension(215, courseNameOfGroupJLabel.getHeight())); // ???
        courseNumberOfGroupJTextField = new JTextField(20);

        boxNumberOfGroup.add(courseNameOfGroupJLabel);
        boxNumberOfGroup.add(Box.createHorizontalStrut(6));
        boxNumberOfGroup.add(courseNumberOfGroupJTextField);
        box.add(boxNumberOfGroup);
        box.add(Box.createVerticalStrut(8));
    }
    public void coursePrice(Box box) {
        Box boxPrice = Box.createHorizontalBox();
        JLabel priceJLabel = new JLabel(ConstForView.PRICE);
        priceJLabel.setPreferredSize(new Dimension(250, priceJLabel.getHeight())); // ???
        priceJTextField = new JTextField(20);

        boxPrice.add(priceJLabel);
        boxPrice.add(Box.createHorizontalStrut(6));
        boxPrice.add(priceJTextField);
        box.add(boxPrice);
        box.add(Box.createVerticalStrut(8));
    }

    public JTextField getIdJTextField() {
        return idJTextField;
    }

    public JTextField getNameJTextField() {
        return nameJTextField;
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

    public JTextField getPriceNDSJTextField() {
        return priceNDSJTextField;
    }

    public JComboBox<CourseType> getCourseTypeJComboBox() {
        return courseTypeJComboBox;
    }
}
