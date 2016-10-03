package laba2.enumeration.table;


public enum  OrganisationColumnNames {
    ID("id"),
    NAME("название"),
    ADDRESS("адрес"),
    PHONE("телефон"),
    EMAIL("e-mail");

    private String name;

    OrganisationColumnNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
