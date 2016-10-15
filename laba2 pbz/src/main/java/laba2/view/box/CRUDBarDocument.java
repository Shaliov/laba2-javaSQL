package laba2.view.box;


import laba2.controller.DocumentController;
import laba2.enumeration.view.ConstForView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CRUDBarDocument  extends Box {
    private DocumentController documentController;

    public CRUDBarDocument(DocumentController documentController)
    {
        super(0);
        this.documentController = documentController;
    }

    public void addDocument() {
        JButton newEntry = new JButton(ConstForView.ADD);
        newEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                documentController.newAddDialogCourseTable();
            }
        });

        add(newEntry);

    }

    public void removeDocument() {
        JButton removeEntry = new JButton(ConstForView.REMOVE);
        removeEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                documentController.removeDialogCourseTable();
            }
        });
        add(removeEntry);
    }

    public void renameDocument() {
        JButton renameEntry = new JButton(ConstForView.RENAME);
        renameEntry.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                documentController.renameDialogCourseTable();
            }
        });
        add(renameEntry);
    }
}

