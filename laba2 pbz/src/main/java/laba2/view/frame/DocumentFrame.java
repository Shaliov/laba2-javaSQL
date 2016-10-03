package laba2.view.frame;

import laba2.modul.table.course.CourseTable;
import laba2.modul.table.document.DocumentTable;
import laba2.view.panel.TableComponent;

import javax.swing.*;
import java.awt.*;


public class DocumentFrame extends JFrame {
    public DocumentFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setTitle("документы");
        setSize(screenWidth / 2 + 10, screenHeight / 2 + 20);
        setLocation(screenWidth / 4, screenHeight / 4);

        DocumentTable documentTable = new DocumentTable();
        TableComponent tableComponent = new TableComponent(documentTable);

        tableComponent.setVisible(true);
        add(tableComponent);
        setResizable(false);
    }
}
