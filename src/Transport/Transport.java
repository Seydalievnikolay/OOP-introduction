package Transport;

public class Transport {
    private final String brand;
    private final String model;
    public String color;
    private final int productionYear;
    private final String productionCountry;
    public int maximumMovementSpeed;

    public Transport(String brand, String model, String color, int productionYear, String productionCountry, int maximumMovementSpeed) {
        this.brand = (brand == null || brand.isEmpty() ? "default" : brand);
        this.model = (model == null || model.isEmpty()? "default" : model);
        this.color = (color == null || color.isEmpty() ? "белый" : color);
        this.productionYear = (productionYear <0 ? 2000 : productionYear);
        this.productionCountry = (productionCountry == null ? "default" : brand);
        this.maximumMovementSpeed = (maximumMovementSpeed < 0 ? 120 : maximumMovementSpeed);
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


    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", maximumMovementSpeed=" + maximumMovementSpeed +
                '}';
    }

}
