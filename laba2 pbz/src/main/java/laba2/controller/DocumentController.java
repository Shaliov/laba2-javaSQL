package laba2.controller;


import laba2.modul.table.document.DocumentTable;
import laba2.view.frame.Dialog.document.AddDialog;
import laba2.view.frame.Dialog.document.RemoveDialog;
import laba2.view.frame.Dialog.document.RenameDialog;

public class DocumentController {
    private DocumentTable documentTable;
    private AddDialog addDialogDocumentTable;
    private RemoveDialog removeDialogDocumentTable;
    private RenameDialog renameDialogDocumentTable;

    public DocumentController(DocumentTable documentTable) {
        this.documentTable = documentTable;
    }

    public void newAddDialogCourseTable() {
        if(addDialogDocumentTable == null){
            addDialogDocumentTable = new AddDialog(documentTable);
        }
        addDialogDocumentTable.setVisible(true);
    }

    public void removeDialogCourseTable() {
        if(removeDialogDocumentTable == null){
            removeDialogDocumentTable = new RemoveDialog(documentTable);
        }
        removeDialogDocumentTable.setVisible(true);
    }

    public void renameDialogCourseTable() {
        if(renameDialogDocumentTable == null){
            renameDialogDocumentTable = new RenameDialog(documentTable);
        }
        renameDialogDocumentTable.setVisible(true);
    }
}
