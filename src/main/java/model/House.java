package model;

public class House {
    private int id;
    private String address;
    private String desc;
    private String type;
    private String image;
    private int price;
    private int account_id;

    public House(int id, String address, String desc, String type, String image, int price, int account_id) {
        this.id = id;
        this.address = address;
        this.desc = desc;
        this.type = type;
        this.image = image;
        this.price = price;
        this.account_id = account_id;
    }

    public House() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
}
