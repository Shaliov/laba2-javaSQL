package laba2.view.frame.Dialog.organisation;


import laba2.controller.dialog.AddDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.organisation.OrganisationTable;
import laba2.view.fields.FieldsOrganisation;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDialog extends JFrame {
    private FieldsOrganisation fieldsOrganisation;
    private AddDialogController addDialogController;

    public AddDialog(OrganisationTable organisationTable) {
        setName("введите данный о организации");
        Box box = Box.createVerticalBox();
        fieldsOrganisation = new FieldsOrganisation();

        fieldsOrganisation.organisationName(box);
        fieldsOrganisation.organisationAddres(box);
        fieldsOrganisation.organisationPhone(box);
        fieldsOrganisation.organisationMail(box);
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
                String organisationName = fieldsOrganisation.getNameJTextField().getText();
                String organisationAdres = fieldsOrganisation.getAddresJTextField().getText();
                String organisationPhone = fieldsOrganisation.getPhoneJTextField().getText();
                String organisationMail = fieldsOrganisation.getMailJTextField().getText();
                if(!organisationName.isEmpty() &&
                        !organisationAdres.isEmpty() &&
                        !organisationPhone.isEmpty() &&
                        !organisationMail.isEmpty()) {

                    addDialogController.addOrganisation(organisationName, organisationAdres, Integer.parseInt(organisationPhone), organisationMail);
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
        fieldsOrganisation.getNameJTextField().setText("");
        fieldsOrganisation.getAddresJTextField().setText("");
        fieldsOrganisation.getPhoneJTextField().setText("");
        fieldsOrganisation.getMailJTextField().setText("");
    }
}