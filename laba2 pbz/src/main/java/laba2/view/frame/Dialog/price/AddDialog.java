package laba2.view.frame.Dialog.price;


import laba2.controller.dialog.AddDialogController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.price.PriceTable;
import laba2.view.fields.FieldsPrice;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDialog extends JFrame {
    private FieldsPrice fieldsPrice;
    private AddDialogController addDialogController;

    public AddDialog(PriceTable priceTable) {
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
//                String dataPrice = fieldsPrice.getPriceDataJTextField().getText();
                String day = fieldsPrice.getDayJTextField().getText();
                String mounth = fieldsPrice.getMounthJTextField().getText();
                String year = fieldsPrice.getYearJTextField().getText();
                String pricePrice = fieldsPrice.getPriceJTextField().getText();
                if(!day.isEmpty() &&
                        !pricePrice.isEmpty() &&
                            !mounth.isEmpty() &&
                                !year.isEmpty()) {

                    addDialogController.addPrice(year + "-" + mounth + "-" + day ,Integer.parseInt(pricePrice));
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
//        fieldsPrice.getPriceDataJTextField().setText("");
        fieldsPrice.getDayJTextField().setText("");
        fieldsPrice.getMounthJTextField().setText("");
        fieldsPrice.getYearJTextField().setText("");
        fieldsPrice.getPriceJTextField().setText("");
    }

}
