package laba2.view.frame.Dialog.teacher;


import laba2.controller.dialog.RenameDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.enumeration.view.TeacherEducation;
import laba2.enumeration.view.TeacherSex;
import laba2.enumeration.view.TeacherType;
import laba2.modul.table.teacher.TeacherTable;
import laba2.view.fields.FieldsPrice;
import laba2.view.fields.FieldsTeacher;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RenameDialog extends JFrame{
    private FieldsTeacher fieldsTeacher;
    private RenameDialog renameDialog;
    private RenameDialogController renameDialogController;
    private int id;

    public RenameDialog(TeacherTable teacherTable) {
        Box box = Box.createVerticalBox();
        renameDialog = this;

        fieldsTeacher = new FieldsTeacher();
        fieldsTeacher.teacherFIO(box);
        fieldsTeacher.date(box);
        fieldsTeacher.teacherSex(box);
        fieldsTeacher.teacherEducation(box);
        fieldsTeacher.teacherType(box);
        okCancle(box);


        renameDialogController = new RenameDialogController();
        renameDialogController.setTeacherTable(teacherTable);

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
                String name = fieldsTeacher.getNameJTextField().getText();
                String surname = fieldsTeacher.getSurnameJTextField().getText();
                String middleName = fieldsTeacher.getMiddlenameJTextField().getText();
                String day = fieldsTeacher.getDayJTextField().getText();
                String mounth = fieldsTeacher.getMounthJTextField().getText();
                String year = fieldsTeacher.getYearJTextField().getText();

                String fio = surname + " " + name + " " + middleName;
                String date = year + "-" + mounth + "-" + day;
                int sex = TeacherSex.valueOf(fieldsTeacher.getTeacherSexJComboBox().getSelectedItem().toString()).getId();
                int education = TeacherEducation.valueOf(fieldsTeacher.getTeacherEducationJComboBox().getSelectedItem().toString()).getId();
                int type = TeacherType.valueOf(fieldsTeacher.getTeacherTypeJComboBox().getSelectedItem().toString()).getId();

                id = Integer.parseInt(JOptionPane.showInputDialog("id:").trim());
                if(!day.isEmpty() &&
                        !mounth.isEmpty() &&
                            !year.isEmpty() &&
                                !name.isEmpty() &&
                                    !surname.isEmpty() &&
                                        !middleName.isEmpty()) {
                    renameDialogController.renameTeacher(id, fio, date, sex, education, type);
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
        fieldsTeacher.getNameJTextField().setText("");
        fieldsTeacher.getSurnameJTextField().setText("");
        fieldsTeacher.getMiddlenameJTextField().setText("");
        fieldsTeacher.getDayJTextField().setText("");
        fieldsTeacher.getMounthJTextField().setText("");
        fieldsTeacher.getYearJTextField().setText("");
    }
}
