package laba2.modul.table.course;


import laba2.modul.dataBase.DBStorage;
import laba2.enumeration.table.CourseColumnNames;
import laba2.modul.table.price.Price;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CourseTable extends AbstractTableModel {
    private List<Course> courseList = DBStorage.getInstance().getCourseList();
    public static final int column = 7;

    public CourseTable() {
    }

    public static final String columnNames[] = {
            CourseColumnNames.ID.getName(),
            CourseColumnNames.NAME.getName(),
            CourseColumnNames.TYPE.getName(),
            CourseColumnNames.TRAINING_DAYS.getName(),
            CourseColumnNames.NUMBER_OF_GROUP.getName(),
            CourseColumnNames.PRICE.getName(),
            CourseColumnNames.PRICE_NDS.getName()
    };


    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Course course = courseList.get(rowIndex);
        return courseList.get(columnIndex);
    }

    public int getRowCount() {
        return courseList.size();
    }

    public int getColumnCount() {
        return column;
    }
}
