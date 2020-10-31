package web.model;


public class Cars {

    private String brand;
    private String model;
    private String govNumber;

    public Cars(String brand, String model, String govNumber) {
        this.brand = brand;
        this.model = model;
        this.govNumber = govNumber;
    }

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", govNumber='" + govNumber + '\'';
    }
}
