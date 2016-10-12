package laba2.view.fields;


import laba2.enumeration.view.ConstForView;
import laba2.enumeration.view.CourseType;

import javax.swing.*;
import java.awt.*;

public class FieldsPrice {
    private JTextField idJTextField;
    private JTextField priceDataJTextField;
    private JTextField priceJTextField;
    private JTextField priceNDSJTextField;

    public FieldsPrice() {

    }

    public void priceID(Box box){
        Box boxPriceID = Box.createHorizontalBox();
        JLabel priceIDLabel = new JLabel(ConstForView.ID);
        priceIDLabel.setPreferredSize(new Dimension(260, priceIDLabel.getHeight()));
        idJTextField = new JTextField(20);

        boxPriceID.add(priceIDLabel);
        boxPriceID.add(Box.createHorizontalStrut(6));
        boxPriceID.add(idJTextField);
        box.add(boxPriceID);
        box.add(Box.createVerticalStrut(8));
    }

    public void price(Box box){
        Box boxPrice = Box.createHorizontalBox();
        JLabel priceLabel = new JLabel(ConstForView.PRICE);
        priceLabel.setPreferredSize(new Dimension(260, priceLabel.getHeight()));
        priceJTextField = new JTextField(20);

        boxPrice.add(priceLabel);
        boxPrice.add(Box.createHorizontalStrut(6));
        boxPrice.add(priceJTextField);
        box.add(boxPrice);
        box.add(Box.createVerticalStrut(8));
    }

    public void priceNDS(Box box){
        Box boxPriceNDS = Box.createHorizontalBox();
        JLabel priceNDSLabel = new JLabel(ConstForView.PRICE_NDS);
        priceNDSLabel.setPreferredSize(new Dimension(260, priceNDSLabel.getHeight()));
        priceNDSJTextField = new JTextField(20);

        boxPriceNDS.add(priceNDSLabel);
        boxPriceNDS.add(Box.createHorizontalStrut(6));
        boxPriceNDS.add(priceJTextField);
        box.add(boxPriceNDS);
        box.add(Box.createVerticalStrut(8));
    }
    public void data(Box box){
        Box boxData = Box.createHorizontalBox();
        JLabel dataLabel = new JLabel(ConstForView.DATE);
        dataLabel.setPreferredSize(new Dimension(260, dataLabel.getHeight()));
        priceDataJTextField = new JTextField(20);

        boxData.add(dataLabel);
        boxData.add(Box.createHorizontalStrut(6));
        boxData.add(priceDataJTextField);
        box.add(boxData);
        box.add(Box.createVerticalStrut(8));
    }

    public JTextField getIdJTextField() {
        return idJTextField;
    }

    public JTextField getPriceDataJTextField() {
        return priceDataJTextField;
    }

    public JTextField getPriceJTextField() {
        return priceJTextField;
    }
}
