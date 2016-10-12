package laba2.view.frame.Dialog.organisation;


import laba2.controller.RemoveDialogController;
import laba2.controller.RenameDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.enumeration.view.CourseType;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.course.Course;
import laba2.modul.table.organisation.Organisation;
import laba2.modul.table.organisation.OrganisationTable;
import laba2.view.fields.FieldsCourse;
import laba2.view.fields.FieldsOrganisation;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RenameDialogOrganisationTable extends JFrame {
    private FieldsOrganisation fieldsOrganisation;
    private RenameDialogOrganisationTable renameDialogOrganisationTable;
    private RenameDialogController renameDialogController;
    private int id;

    public RenameDialogOrganisationTable(OrganisationTable organisationTable) {
        Box box = Box.createVerticalBox();
        renameDialogOrganisationTable = this;

        fieldsOrganisation = new FieldsOrganisation();
        fieldsOrganisation.organisationName(box);
        fieldsOrganisation.organisationAddres(box);
        fieldsOrganisation.organisationPhone(box);
        fieldsOrganisation.organisationMail(box);
        okCancle(box);

        renameDialogController = new RenameDialogController();
        renameDialogController.setOrganisationTable(organisationTable);

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
                String organisationName = fieldsOrganisation.getNameJTextField().getText();
                String organisationAdres = fieldsOrganisation.getAddresJTextField().getText();
                String organisationPhone = fieldsOrganisation.getPhoneJTextField().getText();
                String organisationMail = fieldsOrganisation.getMailJTextField().getText();

                renameDialogController.renameOrganisation(id, organisationName, organisationAdres, Integer.parseInt(organisationPhone), organisationMail);
                freeJTextField();
                find();


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

    public void find() {
        try {
            id = Integer.parseInt(JOptionPane.showInputDialog("id:").trim());
            for (Organisation organisation : DBStorage.getInstance().getOrganisationList()) {
                if (organisation.getId() == id) {
                    fieldsOrganisation.getNameJTextField().setText(organisation.getName());
                    fieldsOrganisation.getAddresJTextField().setText(organisation.getAddress());
                    fieldsOrganisation.getPhoneJTextField().setText(String.valueOf(organisation.getPhone()));
                    fieldsOrganisation.getMailJTextField().setText(organisation.geteMail());
                }

            }
        } catch (NullPointerException e) {
            if(id == 0) {
                renameDialogOrganisationTable.dispose();
            } else {
                find();
            }
        }
    }

    private void freeJTextField() {
        fieldsOrganisation.getNameJTextField().setText("");
        fieldsOrganisation.getAddresJTextField().setText("");
        fieldsOrganisation.getPhoneJTextField().setText("");
        fieldsOrganisation.getMailJTextField().setText("");
    }
}
