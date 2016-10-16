package laba2.modul.table.example;


import laba2.enumeration.table.CourseColumnNames;
import laba2.enumeration.table.DocumentColumnNames;
import laba2.modul.dataBase.DBStorage;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class TeacherForCourseBetwenYearsTable extends AbstractTableModel {
    private List<TeacherForCourseBetwenYearsModel> teacherForCourseBetwenYearseList = DBStorage.getInstance().getTeacherForCourseBetwenYearses();
    public static final int column = 3;

    public TeacherForCourseBetwenYearsTable() {
    }

    public static final String columnNames[] = {
            CourseColumnNames.NAME.getName(),
            DocumentColumnNames.START_TRAINING_DAYS.getName(),
            CourseColumnNames.TRAINING_DAYS.getName()
    };



    public String getColumnName(int column) {
        return columnNames[column];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        TeacherForCourseBetwenYearsModel teacherForCourseBetwenYears = teacherForCourseBetwenYearseList.get(rowIndex);
        return teacherForCourseBetwenYears.get(columnIndex);
    }

    public int getRowCount() {
        return teacherForCourseBetwenYearseList.size();
    }

    public int getColumnCount() {
        return column;
    }
}
