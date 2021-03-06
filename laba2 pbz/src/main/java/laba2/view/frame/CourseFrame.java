package laba2.view.frame;

import laba2.controller.CourseController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.course.CourseTable;
import laba2.view.box.CRUDBarCourse;
import laba2.view.panel.TableComponent;

import javax.swing.*;
import java.awt.*;

public class CourseFrame extends JFrame {
    public CourseFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setTitle(ConstForView.COURSE);
        setSize(screenWidth / 2 + 10, screenHeight / 2 + 20);
        setLocation(screenWidth / 4, screenHeight / 4);

        CourseTable courseTable = new CourseTable();
        TableComponent tableComponent = new TableComponent(courseTable);
        CourseController courseController = new CourseController(courseTable);

        CRUDBarCourse crudBarCourse = new CRUDBarCourse(courseController);
        crudBarCourse.addCourse();
        crudBarCourse.removeCourse();
        crudBarCourse.renameCourse();

        tableComponent.setVisible(true);
        add(tableComponent);
        add(crudBarCourse, "South");
        DBStorage.getInstance().updateCourseList();
        setResizable(false);
    }
}
