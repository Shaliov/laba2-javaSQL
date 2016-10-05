package laba2.view.frame;

import laba2.controller.CourseController;
import laba2.modul.table.course.CourseTable;
import laba2.view.bar.CRUDBarCourse;
import laba2.view.frame.Dialog.AddDialogCourseTable;
import laba2.view.panel.TableComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseFrame extends JFrame {
    private CourseController courseController;

    public CourseFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setTitle("курсы");
        setSize(screenWidth / 2 + 10, screenHeight / 2 + 20);
        setLocation(screenWidth / 4, screenHeight / 4);

        CourseTable courseTable = new CourseTable();
        TableComponent tableComponent = new TableComponent(courseTable);

        courseController = new CourseController();
        CRUDBarCourse crudBarCourse = new CRUDBarCourse();
        crudBarCourse.setCourseController(courseController);
        crudBarCourse.addBar();
        crudBarCourse.setOrientation(SwingConstants.VERTICAL);
        tableComponent.setVisible(true);
        add(tableComponent);
        add(crudBarCourse, "South");

        setResizable(false);
    }
}
