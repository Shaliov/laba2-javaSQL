package laba2.view.fields;


import laba2.enumeration.view.ConstForView;

import javax.swing.*;
import java.awt.*;

public class FieldsOrganisation {
    private JTextField idJTextField;
    private JTextField nameJTextField;
    private JTextField addresJTextField;
    private JTextField phoneJTextField;
    private JTextField mailJTextField;


    public FieldsOrganisation() {

    }

    public void organisationID(Box box){
        Box boxOrgID = Box.createHorizontalBox();
        JLabel orgIDLabel = new JLabel(ConstForView.ID);
        orgIDLabel.setPreferredSize(new Dimension(260, orgIDLabel.getHeight()));
        idJTextField = new JTextField(20);

        boxOrgID.add(orgIDLabel);
        boxOrgID.add(Box.createHorizontalStrut(6));
        boxOrgID.add(idJTextField);
        box.add(boxOrgID);
        box.add(Box.createVerticalStrut(8));
    }

    public void organisationName(Box box){
        Box boxOrgName = Box.createHorizontalBox();
        JLabel orgNameLabel = new JLabel(ConstForView.NAME);
        orgNameLabel.setPreferredSize(new Dimension(230, orgNameLabel.getHeight()));
        nameJTextField = new JTextField(20);

        boxOrgName.add(orgNameLabel);
        boxOrgName.add(Box.createHorizontalStrut(6));
        boxOrgName.add(nameJTextField);
        box.add(boxOrgName);
        box.add(Box.createVerticalStrut(8));
    }

    public void organisationAddres(Box box){
        Box boxOrgAddres = Box.createHorizontalBox();
        JLabel orgAddresLabel = new JLabel(ConstForView.ADDRESS);
        orgAddresLabel.setPreferredSize(new Dimension(230, orgAddresLabel.getHeight()));
        addresJTextField = new JTextField(20);

        boxOrgAddres.add(orgAddresLabel);
        boxOrgAddres.add(Box.createHorizontalStrut(6));
        boxOrgAddres.add(addresJTextField);
        box.add(boxOrgAddres);
        box.add(Box.createVerticalStrut(8));
    }

    public void organisationPhone(Box box){
        Box boxOrgPhone = Box.createHorizontalBox();
        JLabel orgPhoneLabel = new JLabel(ConstForView.PHONE);
        orgPhoneLabel.setPreferredSize(new Dimension(230, orgPhoneLabel.getHeight()));
        phoneJTextField = new JTextField(20);

        boxOrgPhone.add(orgPhoneLabel);
        boxOrgPhone.add(Box.createHorizontalStrut(6));
        boxOrgPhone.add(phoneJTextField);
        box.add(boxOrgPhone);
        box.add(Box.createVerticalStrut(8));
    }

    public void organisationMail(Box box){
        Box boxOrgMail = Box.createHorizontalBox();
        JLabel orgMailLabel = new JLabel(ConstForView.EMAIL);
        orgMailLabel.setPreferredSize(new Dimension(230, orgMailLabel.getHeight()));
        mailJTextField = new JTextField(20);

        boxOrgMail.add(orgMailLabel);
        boxOrgMail.add(Box.createHorizontalStrut(6));
        boxOrgMail.add(mailJTextField);
        box.add(boxOrgMail);
        box.add(Box.createVerticalStrut(8));
    }

    public JTextField getIdJTextField() {
        return idJTextField;
    }

    public JTextField getNameJTextField() {
        return nameJTextField;
    }

    public JTextField getAddresJTextField() {
        return addresJTextField;
    }

    public JTextField getPhoneJTextField() {
        return phoneJTextField;
    }

    public JTextField getMailJTextField() {
        return mailJTextField;
    }
}
