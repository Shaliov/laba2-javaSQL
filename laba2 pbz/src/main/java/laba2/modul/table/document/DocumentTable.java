package laba2.modul.table.document;


import laba2.enumeration.table.DocumentColumnNames;
import laba2.modul.dataBase.DBStorage;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class DocumentTable extends AbstractTableModel {
    private List<Document> documentList = DBStorage.getInstance().getDocumentList();
    public static final int column = 4;

    public DocumentTable() {
    }

    public static final String columnNames[] = {
            DocumentColumnNames.ID_COURSE.getName(),
            DocumentColumnNames.ID_TEACHER.getName(),
            DocumentColumnNames.START_TRAINING_DAYS.getName(),
            DocumentColumnNames.TRAINING_DAYS.getName()
    };



    public String getColumnName(int column) {
        return columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Document document = documentList.get(rowIndex);
        return documentList.get(columnIndex);
    }

    public int getRowCount() {
        return documentList.size();
    }

    public int getColumnCount() {
        return column;
    }
}
