package laba2.view.frame.example;


import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.example.PriceListTable;
import laba2.view.panel.TableComponent;

import javax.swing.*;
import java.awt.*;

public class PriceExample extends JFrame {
    public PriceExample() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setTitle("example 1");
        setSize(screenWidth / 2 + 10, screenHeight / 2 + 20);
        setLocation(screenWidth / 4, screenHeight / 4);

        PriceListTable priceListTable = new PriceListTable();
        TableComponent tableComponent = new TableComponent(priceListTable);


        tableComponent.setVisible(true);
        add(tableComponent);
        DBStorage.getInstance().updatePriceListExample();
        priceListTable.fireTableDataChanged();
        setResizable(false);
    }
}
