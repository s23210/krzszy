package pl.pjatk.krzszy.domain;

public class Car {
    private String Brand;
    private String Model;

    public Car(String brand, String model) {
        Brand = brand;
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }
}
