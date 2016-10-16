package laba2.view.frame.example;


import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.example.TeacherForCourseBetwenYearsTable;
import laba2.view.panel.TableComponent;

import javax.swing.*;
import java.awt.*;

public class TeacherForCourseBetwenYears extends JFrame {
        public TeacherForCourseBetwenYears() {
            Toolkit kit = Toolkit.getDefaultToolkit();
            Dimension screenSize = kit.getScreenSize();
            int screenHeight = screenSize.height;
            int screenWidth = screenSize.width;
            setTitle("example 1");
            setSize(screenWidth / 2 + 10, screenHeight / 2 + 20);
            setLocation(screenWidth / 4, screenHeight / 4);

            TeacherForCourseBetwenYearsTable teacherForCourseBetwenYearsTable = new TeacherForCourseBetwenYearsTable();
            TableComponent tableComponent = new TableComponent(teacherForCourseBetwenYearsTable);


            tableComponent.setVisible(true);
            add(tableComponent);
            String fio = JOptionPane.showInputDialog("fio:").trim();
            String date1 = JOptionPane.showInputDialog("date1:").trim();
            String date2 = JOptionPane.showInputDialog("date2:").trim();
            DBStorage.getInstance().updateteacherForCourseBetwenYearseList(fio, date1,date2);
            teacherForCourseBetwenYearsTable.fireTableDataChanged();
            setResizable(false);
        }
 }
