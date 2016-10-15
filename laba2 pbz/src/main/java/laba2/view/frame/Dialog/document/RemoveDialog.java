package laba2.view.frame.Dialog.document;


import laba2.controller.dialog.RemoveDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.table.document.DocumentTable;
import laba2.modul.table.teacher.TeacherTable;
import laba2.view.fields.FieldsDocument;
import laba2.view.fields.FieldsTeacher;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveDialog extends JFrame {
    private FieldsDocument fieldsDocument;
    private RemoveDialogController removeDialogController;

    public RemoveDialog(DocumentTable documentTable)  {
        setName("данные для удаления");

        Box box = Box.createVerticalBox();
        fieldsDocument = new FieldsDocument();

        fieldsDocument.docId(box);

        okCancle(box);

        removeDialogController = new RemoveDialogController();
        removeDialogController.setDocumentTable(documentTable);

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
                if(!fieldsDocument.getIdJTextField().getText().equals("")) {
                    removeDialogController.removeDocument(Integer.parseInt(fieldsDocument.getIdJTextField().getText()));
                    fieldsDocument.getIdJTextField().setText("");
                }

            }
        });
        JButton cancelButton = new JButton(ConstForView.CLOSE);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fieldsDocument.getIdJTextField().setText("");
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
