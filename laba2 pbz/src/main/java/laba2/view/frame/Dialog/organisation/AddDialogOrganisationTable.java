package laba2.view.frame.Dialog.organisation;


import laba2.controller.AddDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.enumeration.view.CourseType;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.course.CourseTable;
import laba2.modul.table.organisation.OrganisationTable;
import laba2.view.fields.FieldsCourse;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDialogOrganisationTable extends JFrame {
    private FieldsCourse fieldsCourse;
    private AddDialogController addDialogController;

    public AddDialogOrganisationTable(OrganisationTable organisationTable) {
        setName("введите данный о организации");
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
        addDialogController.setOrganisationTable(organisationTable);
    }

    private void okCancle(Box box) {
        Box okBox = Box.createHorizontalBox();
        JButton okButton = new JButton(ConstForView.OK);
        okButton.addActionListener(new ActionListener() {
                                       public void actionPerformed(ActionEvent e) {


                                       }
                                   }

        );
        JButton cancelButton = new JButton(ConstForView.CLOSE);
        cancelButton.addActionListener(new ActionListener() {
                                           public void actionPerformed(ActionEvent e) {
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