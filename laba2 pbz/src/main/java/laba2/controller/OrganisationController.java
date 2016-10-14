package laba2.controller;


import laba2.modul.table.organisation.OrganisationTable;
import laba2.view.frame.Dialog.organisation.AddDialog;
import laba2.view.frame.Dialog.organisation.RemoveDialog;
import laba2.view.frame.Dialog.organisation.RenameDialog;

public class OrganisationController {
    private OrganisationTable organisationTable;
    private AddDialog addDialogOrganisationTable;
    private RemoveDialog removeDialogOrganisationTable;
    private RenameDialog renameDialogOrganisationTable;
    public OrganisationController(OrganisationTable organisationTable) {
        this.organisationTable = organisationTable;
    }

    public void newAddDialogOrganisationTable() {
        if(addDialogOrganisationTable == null){
            addDialogOrganisationTable = new AddDialog(organisationTable);
        }
        addDialogOrganisationTable.setVisible(true);
    }

    public void removeDialogOrganisationTable() {
        if(removeDialogOrganisationTable == null){
            removeDialogOrganisationTable = new RemoveDialog(organisationTable);
        }
        removeDialogOrganisationTable.setVisible(true);
    }

    public void renameDialogOrganisationTable() {
        if(renameDialogOrganisationTable == null){
            renameDialogOrganisationTable = new RenameDialog(organisationTable);
        }
        renameDialogOrganisationTable.setVisible(true);
//        renameDialogOrganisationTable.find();
    }

}
