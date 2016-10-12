package laba2.view.box;


import laba2.controller.CourseController;
import laba2.controller.OrganisationController;
import laba2.enumeration.view.ConstForView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDOrganisation extends Box {
    private OrganisationController organisationController;

    public CRUDOrganisation(OrganisationController organisationController)
    {
        super(0);
        this.organisationController = organisationController;
    }

    public void addCourse() {
        JButton newEntry = new JButton(ConstForView.ADD);
        newEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                organisationController.newAddDialogOrganisationTable();
            }
        });

        add(newEntry);

    }

    public void removeCourse() {
        JButton removeEntry = new JButton(ConstForView.REMOVE);
        removeEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                organisationController.removeDialogOrganisationTable();
            }
        });
        add(removeEntry);
    }

    public void renameCourse() {
        JButton renameEntry = new JButton(ConstForView.RENAME);
        renameEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                organisationController.renameDialogOrganisationTable();
            }
        });
        add(renameEntry);
    }



}
