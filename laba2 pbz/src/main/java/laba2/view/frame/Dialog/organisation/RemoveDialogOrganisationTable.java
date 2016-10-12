package laba2.view.frame.Dialog.organisation;


import laba2.controller.AddDialogController;
import laba2.controller.RemoveDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.table.organisation.OrganisationTable;
import laba2.view.fields.FieldsCourse;
import laba2.view.fields.FieldsOrganisation;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveDialogOrganisationTable extends JFrame {
    private FieldsOrganisation fieldsOrganisation;
    private RemoveDialogController removeDialogController;

    public RemoveDialogOrganisationTable(OrganisationTable organisationTable)  {
        setName("данные для удаления");

        Box box = Box.createVerticalBox();
        fieldsOrganisation = new FieldsOrganisation();

        fieldsOrganisation.organisationID(box);

        okCancle(box);

        removeDialogController = new RemoveDialogController();
        removeDialogController.setOrganisationTable(organisationTable);

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
                if(!fieldsOrganisation.getIdJTextField().getText().equals("")) {
                    removeDialogController.removeOrganisation(Integer.parseInt(fieldsOrganisation.getIdJTextField().getText()));
                    fieldsOrganisation.getIdJTextField().setText("");
                }

            }
        });
        JButton cancelButton = new JButton(ConstForView.CLOSE);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fieldsOrganisation.getIdJTextField().setText("");
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
