package laba2.enumeration.table;


public enum PriceColumnNames {
    ID("id"),
    DATE("день"),
    PRICE("цена"),
    PRICE_NDS("цена с учётом НДС");

    private String name;

    PriceColumnNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
