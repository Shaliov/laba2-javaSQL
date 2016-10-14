package laba2.view.frame.Dialog.price;

import laba2.controller.dialog.RenameDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.table.price.PriceTable;
import laba2.view.fields.FieldsPrice;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RenameDialog extends JFrame{
    private FieldsPrice fieldsPrice;
    private RenameDialog renameDialogPriceTable;
    private RenameDialogController renameDialogController;
    private int id;

    public RenameDialog(PriceTable priceTable) {
        Box box = Box.createVerticalBox();
        renameDialogPriceTable = this;

        fieldsPrice = new FieldsPrice();
        fieldsPrice.data(box);
        fieldsPrice.price(box);
        okCancle(box);

        renameDialogController = new RenameDialogController();
        renameDialogController.setPriceTable(priceTable);

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
                String data = fieldsPrice.getYearJTextField().getText() + "-" + fieldsPrice.getMounthJTextField().getText() + "-" + fieldsPrice.getDayJTextField().getText();
                String price = fieldsPrice.getPriceJTextField().getText();

                id = Integer.parseInt(JOptionPane.showInputDialog("id:").trim());
                renameDialogController.renamePrice(id, data, Integer.parseInt(price));
                freeJTextField();
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
        fieldsPrice.getDayJTextField().setText("");
        fieldsPrice.getMounthJTextField().setText("");
        fieldsPrice.getYearJTextField().setText("");
        fieldsPrice.getPriceJTextField().setText("");
    }
}