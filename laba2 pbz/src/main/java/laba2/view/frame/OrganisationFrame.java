package laba2.view.frame;


import laba2.modul.table.organisation.OrganisationTable;
import laba2.modul.table.price.PriceTable;
import laba2.view.panel.TableComponent;

import javax.swing.*;
import java.awt.*;

public class OrganisationFrame extends JFrame {
    public OrganisationFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setTitle("организация");
        setSize(screenWidth / 2 + 10, screenHeight / 2 + 20);
        setLocation(screenWidth / 4, screenHeight / 4);

        OrganisationTable organisationTable = new OrganisationTable();
        TableComponent tableComponent = new TableComponent(organisationTable);

        tableComponent.setVisible(true);
        add(tableComponent);
        setResizable(false);
    }

}
