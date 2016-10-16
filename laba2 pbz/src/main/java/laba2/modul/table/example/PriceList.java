package laba2.modul.table.example;



public class PriceList {
    private String courseName;
    private int courseTrainingDays;
    private int pricePrice;
    private double pricePriceNDS;
    public PriceList() {
    }

    public Object get(int index) {
        switch (index) {
            case 0:
                return getCourseName();
            case 1:
                return getCourseTrainingDays();
            case 2:
                return getPricePrice();
            case 3:
                return getPricePriceNDS();
            default:
                return "";
        }
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseTrainingDays(int courseTrainingDays) {
        this.courseTrainingDays = courseTrainingDays;
    }

    public void setPricePrice(int pricePrice) {
        this.pricePrice = pricePrice;
    }

    public void setPricePriceNDS(double pricePriceNDS) {
        this.pricePriceNDS = pricePriceNDS;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCourseTrainingDays() {
        return courseTrainingDays;
    }

    public int getPricePrice() {
        return pricePrice;
    }

    public double getPricePriceNDS() {
        return pricePriceNDS;
    }
}
