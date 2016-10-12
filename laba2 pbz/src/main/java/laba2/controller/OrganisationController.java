package laba2.controller;


import laba2.modul.table.organisation.Organisation;
import laba2.modul.table.organisation.OrganisationTable;
import laba2.view.frame.Dialog.organisation.AddDialogOrganisationTable;
import laba2.view.frame.Dialog.organisation.RemoveDialogOrganisationTable;
import laba2.view.frame.Dialog.organisation.RenameDialogOrganisationTable;

public class OrganisationController {
    private OrganisationTable organisationTable;
    private AddDialogOrganisationTable addDialogOrganisationTable;
    private RemoveDialogOrganisationTable removeDialogOrganisationTable;
    private RenameDialogOrganisationTable renameDialogOrganisationTable;
    public OrganisationController(OrganisationTable organisationTable) {
        this.organisationTable = organisationTable;
    }

    public void newAddDialogOrganisationTable() {
        if(addDialogOrganisationTable == null){
            addDialogOrganisationTable = new AddDialogOrganisationTable(organisationTable);
        }
        addDialogOrganisationTable.setVisible(true);
    }

    public void removeDialogOrganisationTable() {
        if(removeDialogOrganisationTable == null){
            removeDialogOrganisationTable = new RemoveDialogOrganisationTable(organisationTable);
        }
        removeDialogOrganisationTable.setVisible(true);
    }

    public void renameDialogOrganisationTable() {
        if(renameDialogOrganisationTable == null){
            renameDialogOrganisationTable = new RenameDialogOrganisationTable(organisationTable);
        }
        renameDialogOrganisationTable.setVisible(true);
        renameDialogOrganisationTable.find();
    }

}
