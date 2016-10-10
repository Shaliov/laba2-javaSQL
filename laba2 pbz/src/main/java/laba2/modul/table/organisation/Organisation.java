package laba2.modul.table.organisation;


public class Organisation {
    private int id;
    private String name;
    private String address;
    private int phone;
    private String eMail;

    public Organisation(String name, String address, int phone, String eMail) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
    }

    public Object get(int index) {
        switch (index) {
            case 0:
                return getId();
            case 1:
                return getName();
            case 2:
                return getAddress();
            case 3:
                return getPhone();
            case 4:
                return geteMail();
            default:
                return "";
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public String geteMail() {
        return eMail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
