package Transport;

public class Transport {
    private final String brand;
    private final String model;
    public String color;
    private final int productionYear;
    private final String productionCountry;
    public int maximumMovementSpeed;

    public Transport(String brand, String model, String color, int productionYear, String productionCountry, int maximumMovementSpeed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.maximumMovementSpeed = maximumMovementSpeed;
    }



    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed;
    }
}
