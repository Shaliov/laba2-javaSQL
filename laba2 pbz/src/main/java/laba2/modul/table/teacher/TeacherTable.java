package laba2.modul.table.teacher;


import laba2.enumeration.table.TeacherColumnNames;
import laba2.modul.dataBase.DBStorage;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TeacherTable extends AbstractTableModel {
    private List<Teacher> teacherList = DBStorage.getInstance().getTeacherList();
    public static final int column = 6;

    public TeacherTable() {
    }

    public static final String columnNames[] = {
            TeacherColumnNames.ID.getName(),
            TeacherColumnNames.FIO.getName(),
            TeacherColumnNames.BERTHDAY.getName(),
            TeacherColumnNames.SEX.getName(),
            TeacherColumnNames.EDUCATION.getName(),
            TeacherColumnNames.TYPE.getName()
    };



    public String getColumnName(int column) {
        return columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Teacher teacher = teacherList.get(rowIndex);
        return teacherList.get(columnIndex);
    }

    public int getRowCount() {
        return teacherList.size();
    }

    public int getColumnCount() {
        return column;
    }
}
