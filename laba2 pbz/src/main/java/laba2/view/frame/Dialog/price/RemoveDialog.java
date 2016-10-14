package laba2.view.frame.Dialog.price;


import laba2.controller.dialog.RemoveDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.organisation.OrganisationTable;
import laba2.modul.table.price.PriceTable;
import laba2.view.fields.FieldsOrganisation;
import laba2.view.fields.FieldsPrice;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveDialog extends JFrame {
    private FieldsPrice fieldsPrice;
    private RemoveDialogController removeDialogController;

    public RemoveDialog(PriceTable priceTable)  {
        setName("данные для удаления");

        Box box = Box.createVerticalBox();
        fieldsPrice = new FieldsPrice();

        fieldsPrice.priceID(box);

        okCancle(box);

        removeDialogController = new RemoveDialogController();
        removeDialogController.setPriceTable(priceTable);

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
                if(!fieldsPrice.getIdJTextField().getText().equals("")) {
                    removeDialogController.removePrice(Integer.parseInt(fieldsPrice.getIdJTextField().getText()));
                    fieldsPrice.getIdJTextField().setText("");
                }

            }
        });
        JButton cancelButton = new JButton(ConstForView.CLOSE);
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fieldsPrice.getIdJTextField().setText("");
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