package laba2.view.panel;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;

public class TableComponent extends JPanel {

    public TableComponent(AbstractTableModel tableModel) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocation(screenWidth / 4, screenHeight / 4);

        JTable table = new JTable(tableModel);
        Dimension dimension = new Dimension(screenWidth / 2, screenHeight / 2);
        table.setPreferredSize(dimension);
        JScrollPane scrollPane =  new JScrollPane(table);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(screenWidth / 2 - 90, screenHeight / 2 - 100));
        add(scrollPane);
        scrollPane.revalidate();
        scrollPane.setVisible(true);
    }
}
