package laba2.view.frame;


import laba2.controller.TeacherController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.teacher.TeacherTable;
import laba2.view.box.CRUDBarTeacher;
import laba2.view.panel.TableComponent;

import javax.swing.*;
import java.awt.*;

public class TeacherFrame extends JFrame {

    public TeacherFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setTitle(ConstForView.TEACHER);
        setSize(screenWidth / 2 + 10, screenHeight / 2 + 20);
        setLocation(screenWidth / 4, screenHeight / 4);

        TeacherTable teacherTable = new TeacherTable();
        TableComponent tableComponent = new TableComponent(teacherTable);
        TeacherController teacherController = new TeacherController(teacherTable);

        CRUDBarTeacher crudBarTeacher = new CRUDBarTeacher(teacherController);
        crudBarTeacher.addTeacher();
        crudBarTeacher.removeTeacher();
        crudBarTeacher.renameTeacher();

        add(crudBarTeacher,"South");
        tableComponent.setVisible(true);
        add(tableComponent);
        DBStorage.getInstance().updateTeacherList();
        setResizable(false);
    }
}
