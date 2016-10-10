package laba2.modul.table.price;


import java.util.Date;

public class Price {
    private int id;
    private Date date;
    private int price;
    private final double priceNDS;
    private static final double NDS = 1.20;

    public Price(Date date, int price) {
        this.date = date;
        this.price = price;
        priceNDS = price * NDS;
    }

    public Object get(int index) {
        switch (index) {
            case 0:
                return getId();
            case 1:
                return getDate();
            case 2:
                return getPrice();
            case 3:
                return getPriceNDS();
            default:
                return "";
        }
    }

    public Date getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public double getPriceNDS() {
        return priceNDS;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
