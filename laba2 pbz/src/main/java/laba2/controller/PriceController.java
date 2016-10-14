package laba2.controller;


import laba2.modul.table.price.PriceTable;
import laba2.view.frame.Dialog.price.AddDialog;
import laba2.view.frame.Dialog.price.RemoveDialog;
import laba2.view.frame.Dialog.price.RenameDialog;

public class PriceController {
    private PriceTable priceTable;
    private AddDialog addDialogPriceTable;
    private RemoveDialog removeDialogPriceTable;
    private RenameDialog renameDialogPriceTable;

    public PriceController(PriceTable priceTable) {
        this.priceTable = priceTable;
    }

    public void newAddDialogPriceTable() {
        if(addDialogPriceTable == null){
            addDialogPriceTable = new AddDialog(priceTable);
        }
        addDialogPriceTable.setVisible(true);
    }

    public void removeDialogPriceTable() {
        if(removeDialogPriceTable == null){
            removeDialogPriceTable = new RemoveDialog(priceTable);
        }
        removeDialogPriceTable.setVisible(true);
    }

    public void renameDialogPriceTable() {
        if(renameDialogPriceTable == null){
            renameDialogPriceTable = new RenameDialog(priceTable);
        }
        renameDialogPriceTable.setVisible(true);
    }

}
