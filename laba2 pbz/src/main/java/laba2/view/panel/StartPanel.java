package laba2.view.panel;


import laba2.enumeration.view.ConstForView;
import laba2.view.frame.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanel extends JPanel {
    //создаются разные контроллеры

    public StartPanel() {
        addStartBar(this);
    }

    private void addStartBar(JPanel panel) {
        final JButton organisation = new JButton(ConstForView.ORGANISATION);
        organisation.setPreferredSize(new Dimension(180,25));
        organisation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OrganisationFrame organisationFrame = new OrganisationFrame();
                organisationFrame.setVisible(true);

            }
        });
        JButton course = new JButton(ConstForView.COURSE);
        course.setPreferredSize(new Dimension(180,25));
        course.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CourseFrame courseFrame = new CourseFrame();
                courseFrame.setVisible(true);
            }
        });
        JButton price = new JButton(ConstForView.PRICE);
        price.setPreferredSize(new Dimension(180, 25));
        price.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PriceFrame priceFrame = new PriceFrame();
                priceFrame.setVisible(true);
            }
        });
        JButton teacher = new JButton(ConstForView.TEACHER);
        teacher.setPreferredSize(new Dimension(180,25));
        teacher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TeacherFrame teacherFrame = new TeacherFrame();
                teacherFrame.setVisible(true);
            }
        });
        JButton document = new JButton(ConstForView.DOCUMENTS);
        document.setPreferredSize(new Dimension(180,25));
        document.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DocumentFrame documentFrame = new DocumentFrame();
                documentFrame.setVisible(true);
            }
        });


        panel.add(organisation);
        panel.add(course);
        panel.add(price);
        panel.add(teacher);
        panel.add(document);
    }
}
