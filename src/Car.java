public class Car {
    private String plate;
    private String brand;
    private String colour;

    private int numberOfWheels = 4;

    public Car(String plate, String brand, String colour) {
        this.plate = plate;
        this.brand = brand;
        this.colour = colour;
    }

    public String getPlate() {
        return plate;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }
}
