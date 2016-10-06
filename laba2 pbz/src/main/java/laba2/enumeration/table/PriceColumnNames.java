package laba2.enumeration.table;


import laba2.enumeration.view.ConstForView;

public enum PriceColumnNames {
    ID(ConstForView.ID),
    DATE(ConstForView.DAY),
    PRICE(ConstForView.PRICE),
    PRICE_NDS(ConstForView.PRICE_NDS);

    private String name;

    PriceColumnNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
