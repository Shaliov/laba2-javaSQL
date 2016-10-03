package laba2.modul.table.organisation;


import laba2.enumeration.table.OrganisationColumnNames;
import laba2.modul.dataBase.DBStorage;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class OrganisationTable extends AbstractTableModel {
    private List<Organisation> organisationList = DBStorage.getInstance().getOrganisationList();
    public static final int column = 5;

    public OrganisationTable() {
    }

    public static final String columnNames[] = {
            OrganisationColumnNames.ID.getName(),
            OrganisationColumnNames.NAME.getName(),
            OrganisationColumnNames.ADDRESS.getName(),
            OrganisationColumnNames.PHONE.getName(),
            OrganisationColumnNames.EMAIL.getName()
    };



    public String getColumnName(int column) {
        return columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Organisation organisation = organisationList.get(rowIndex);
        return organisationList.get(columnIndex);
    }

    public int getRowCount() {
        return organisationList.size();
    }

    public int getColumnCount() {
        return column;
    }
}
