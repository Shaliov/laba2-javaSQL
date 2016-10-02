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
