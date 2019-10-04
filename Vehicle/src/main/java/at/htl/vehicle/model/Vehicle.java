package at.htl.vehicle.model;

public class Vehicle {
    private String brand;
    private String type;

    //region Constructors
    public Vehicle() {

    }

    public Vehicle(String brand, String type) {
        setBrand(brand);
        setType(type);
    }
    //endregion

    //region Getter and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //endregion

    @Override
    public String toString () {
        return this.brand + " " + this.type;
    }
}
