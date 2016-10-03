package laba2.view.frame;


import laba2.modul.table.document.DocumentTable;
import laba2.modul.table.price.PriceTable;
import laba2.view.panel.TableComponent;

import javax.swing.*;
import java.awt.*;

public class PriceFrame extends JFrame {
    public PriceFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setTitle("цена");
        setSize(screenWidth / 2 + 10, screenHeight / 2 + 20);
        setLocation(screenWidth / 4, screenHeight / 4);

        PriceTable priceTable = new PriceTable();
        TableComponent tableComponent = new TableComponent(priceTable);

        tableComponent.setVisible(true);
        add(tableComponent);
        setResizable(false);
    }
}
