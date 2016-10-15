package laba2.view.frame.Dialog.document;


import laba2.controller.dialog.AddDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.table.document.DocumentTable;
import laba2.view.fields.FieldsDocument;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDialog extends JFrame {
    private FieldsDocument fieldsDocument;
    private AddDialogController addDialogController;

    public AddDialog(DocumentTable documentTable) {
        setName("введите данный о документе");
        Box box = Box.createVerticalBox();
        fieldsDocument = new FieldsDocument();

        fieldsDocument.courseID(box);
        fieldsDocument.teacherID(box);
        fieldsDocument.data(box);
        fieldsDocument.traningDays(box);
        okCancle(box);

        box.setBorder(new EmptyBorder(12, 12, 12, 12));
        setContentPane(box);
        pack();
        setResizable(false);
        setPreferredSize(new Dimension(600, box.getHeight()));
        setSize(new Dimension(400, box.getHeight() + 20));
        addDialogController = new AddDialogController();
        addDialogController.setDocumentTable(documentTable);
    }

    private void okCancle(Box box) {
        Box okBox = Box.createHorizontalBox();
        JButton okButton = new JButton(ConstForView.OK);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String courseId = fieldsDocument.getCourseIdJTextField().getText();
                String teacherId = fieldsDocument.getTeacherIdJTextField().getText();
                String day = fieldsDocument.getDayJTextField().getText();
                String mounth = fieldsDocument.getMounthJTextField().getText();
                String year = fieldsDocument.getYearJTextField().getText();
                String trainignsDay = fieldsDocument.getCourseTrainingDaysJTextField().getText();
                String startTrainigsDay = year + "-" + mounth + "-" + day;

                if(!day.isEmpty() &&
                        !mounth.isEmpty() &&
                            !year.isEmpty() &&
                                !courseId.isEmpty() &&
                                    !teacherId.isEmpty() &&
                                        !startTrainigsDay.isEmpty() &&
                                            !trainignsDay.isEmpty()) {

                    addDialogController.addDocument( Integer.parseInt(courseId),  Integer.parseInt(teacherId), startTrainigsDay, Integer.parseInt(trainignsDay));
                    freeJTextField();

                }
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
        fieldsDocument.getCourseIdJTextField().setText("");
        fieldsDocument.getTeacherIdJTextField().setText("");
        fieldsDocument.getDayJTextField().setText("");
        fieldsDocument.getMounthJTextField().setText("");
        fieldsDocument.getYearJTextField().setText("");
        fieldsDocument.getCourseTrainingDaysJTextField().setText("");

    }
}
