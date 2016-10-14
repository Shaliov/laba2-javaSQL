package laba2.view.frame;

import laba2.controller.PriceController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.price.PriceTable;
import laba2.view.box.CRUDBarPrice;
import laba2.view.panel.TableComponent;

import javax.swing.*;
import java.awt.*;

public class PriceFrame extends JFrame {
    private PriceController priceController;

    public PriceFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setTitle(ConstForView.PRICE);
        setSize(screenWidth / 2 + 10, screenHeight / 2 + 20);
        setLocation(screenWidth / 4, screenHeight / 4);

        PriceTable priceTable = new PriceTable();
        TableComponent tableComponent = new TableComponent(priceTable);

        priceController = new PriceController(priceTable);
        CRUDBarPrice crudBarPrice = new CRUDBarPrice(priceController);
        crudBarPrice.addPrice();
        crudBarPrice.removePrice();
        crudBarPrice.renamePrice();


        tableComponent.setVisible(true);
        add(tableComponent);
        add(crudBarPrice, "South");
        DBStorage.getInstance().updatePriceList();
        setResizable(false);
    }
}
