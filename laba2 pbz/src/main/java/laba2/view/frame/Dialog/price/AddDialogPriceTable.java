package laba2.view.frame.Dialog.price;


import laba2.controller.AddDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.table.price.PriceTable;
import laba2.view.fields.FieldsOrganisation;
import laba2.view.fields.FieldsPrice;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDialogPriceTable extends JFrame {
    private FieldsPrice fieldsPrice;
    private AddDialogController addDialogController;

    public AddDialogPriceTable(PriceTable priceTable) {
        setName("введите данный о цене");
        Box box = Box.createVerticalBox();
        fieldsPrice = new FieldsPrice();

        fieldsPrice.data(box);
        fieldsPrice.price(box);
        okCancle(box);

        box.setBorder(new EmptyBorder(12, 12, 12, 12));
        setContentPane(box);
        pack();
        setResizable(false);
        setPreferredSize(new Dimension(600, box.getHeight()));
        setSize(new Dimension(400, box.getHeight() + 20));
        addDialogController = new AddDialogController();
        addDialogController.setPriceTable(priceTable);
    }

    private void okCancle(Box box) {
        Box okBox = Box.createHorizontalBox();
        JButton okButton = new JButton(ConstForView.OK);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dataPrice = fieldsPrice.getPriceDataJTextField().getText();
                String pricePrice = fieldsPrice.getPriceJTextField().getText();
                if(!dataPrice.isEmpty() &&
                        !pricePrice.isEmpty()) {

//                    addDialogController.addOrganisation(dataPrice, pricePrice);
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
        fieldsPrice.getPriceDataJTextField().setText("");
        fieldsPrice.getPriceJTextField().setText("");
    }

}
