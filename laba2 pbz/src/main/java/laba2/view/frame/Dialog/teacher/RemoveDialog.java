package laba2.view.frame.Dialog.teacher;


import laba2.controller.dialog.RemoveDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.table.price.PriceTable;
import laba2.modul.table.teacher.TeacherTable;
import laba2.view.fields.FieldsPrice;
import laba2.view.fields.FieldsTeacher;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveDialog extends JFrame {
    private FieldsTeacher fieldsTeacher;
    private RemoveDialogController removeDialogController;

    public RemoveDialog(TeacherTable teacherTable)  {
        setName("данные для удаления");

        Box box = Box.createVerticalBox();
        fieldsTeacher = new FieldsTeacher();

        fieldsTeacher.teacherID(box);

        okCancle(box);

        removeDialogController = new RemoveDialogController();
        removeDialogController.setTeacherTable(teacherTable);

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
                if(!fieldsTeacher.getIdJTextField().getText().equals("")) {
                    removeDialogController.removeTeacher(Integer.parseInt(fieldsTeacher.getIdJTextField().getText()));
                    fieldsTeacher.getIdJTextField().setText("");
                }

            }
        });
        JButton cancelButton = new JButton(ConstForView.CLOSE);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fieldsTeacher.getIdJTextField().setText("");
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
}
