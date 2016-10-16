package laba2.modul.table.example;


import laba2.enumeration.table.CourseColumnNames;
import laba2.modul.dataBase.DBStorage;
import laba2.view.frame.example.PriceExample;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PriceListTable  extends AbstractTableModel {
    private List<PriceList> priceLists = DBStorage.getInstance().getPriceListsExample();
    public static final int column = 4;

    public PriceListTable() {
    }

    public static final String columnNames[] = {
            CourseColumnNames.NAME.getName(),
            CourseColumnNames.TRAINING_DAYS.getName(),
            CourseColumnNames.PRICE.getName(),
            CourseColumnNames.PRICE_NDS.getName(),
    };



    public String getColumnName(int column) {
        return columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        PriceList priceList = priceLists.get(rowIndex);
        return priceList.get(columnIndex);
    }

    public int getRowCount() {
        return priceLists.size();
    }

    public int getColumnCount() {
        return column;
    }
}
