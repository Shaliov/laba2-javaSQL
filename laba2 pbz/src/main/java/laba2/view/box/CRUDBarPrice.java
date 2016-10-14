package laba2.view.box;

import laba2.controller.PriceController;
import laba2.enumeration.view.ConstForView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDBarPrice extends Box {
    private PriceController priceController;

    public CRUDBarPrice(PriceController priceController)
    {
        super(0);
        this.priceController = priceController;
    }

    public void addPrice() {
        JButton newEntry = new JButton(ConstForView.ADD);
        newEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                priceController.newAddDialogPriceTable();
            }
        });
        add(newEntry);

    }

    public void removePrice() {
        JButton removeEntry = new JButton(ConstForView.REMOVE);
        removeEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                priceController.removeDialogPriceTable();
            }
        });
        add(removeEntry);
    }

    public void renamePrice() {
        JButton renameEntry = new JButton(ConstForView.RENAME);
        renameEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                priceController.renameDialogPriceTable();
            }
        });
        add(renameEntry);
    }
}

