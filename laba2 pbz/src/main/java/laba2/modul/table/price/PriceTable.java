package laba2.modul.table.price;


import laba2.enumeration.table.PriceColumnNames;
import laba2.modul.dataBase.DBStorage;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class PriceTable extends AbstractTableModel {
    private List<Price> priceList = DBStorage.getInstance().getPriceList();
    public static final int column = 4;

    public PriceTable() {
    }

    public static final String columnNames[] = {
            PriceColumnNames.ID.getName(),
            PriceColumnNames.DATE.getName(),
            PriceColumnNames.PRICE.getName(),
            PriceColumnNames.PRICE_NDS.getName()
    };



    public String getColumnName(int column) {
        return columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Price price = priceList.get(rowIndex);
        return price.get(columnIndex);
    }

    public int getRowCount() {
        return priceList.size();
    }

    public int getColumnCount() {
        return column;
    }
}
