package laba2.enumeration.table;


import laba2.enumeration.view.ConstForView;

public enum  OrganisationColumnNames {
    ID(ConstForView.ID),
    NAME(ConstForView.NAME),
    ADDRESS(ConstForView.ADDRESS),
    PHONE(ConstForView.PHONE),
    EMAIL(ConstForView.EMAIL);

    private String name;

    OrganisationColumnNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
