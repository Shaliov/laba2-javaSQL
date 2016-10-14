package laba2.view.frame;


import laba2.controller.OrganisationController;
import laba2.enumeration.view.ConstForView;
import laba2.modul.dataBase.DBStorage;
import laba2.modul.table.organisation.OrganisationTable;
import laba2.modul.table.price.PriceTable;
import laba2.view.box.CRUDBarCourse;
import laba2.view.box.CRUDOrganisation;
import laba2.view.panel.TableComponent;

import javax.swing.*;
import java.awt.*;

public class OrganisationFrame extends JFrame {
    private OrganisationController organisationController;
    public OrganisationFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setTitle(ConstForView.ORGANISATION);
        setSize(screenWidth / 2 + 10, screenHeight / 2 + 20);
        setLocation(screenWidth / 4, screenHeight / 4);

        OrganisationTable organisationTable = new OrganisationTable();
        TableComponent tableComponent = new TableComponent(organisationTable);

        organisationController = new OrganisationController(organisationTable);
        CRUDOrganisation crudOrganisation = new CRUDOrganisation(organisationController);
        crudOrganisation.addCourse();
        crudOrganisation.removeCourse();
        crudOrganisation.renameCourse();

        tableComponent.setVisible(true);

     
        tableComponent.setVisible(true);
        add(tableComponent);
        add(crudOrganisation, "South");
        DBStorage.getInstance().updateOrganisationList();
        setResizable(false);
    }

}
