package Transport;

public abstract  class Transport {
    String brand;
    String model;
    Double engineVolume;
    Boolean startTheMoving;
    Boolean finishMovement;

    public Transport(String brand, String model, Double engineVolume) {
        this.brand = (isBrandIsEmpty(brand) ? "default" : brand );
        this.model = (isModelIsEmpty(model) ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 2.2 : engineVolume);
    }

    private boolean isBrandIsEmpty(String brand) {
        return brand == null || brand.isEmpty();
    }
    private  boolean isModelIsEmpty(String model) {
        return model == null || model.isEmpty();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public abstract void pitStop();

    public abstract void bestLapTime();

    public abstract void maximumSpeed();

    public void startMoving() {
        startTheMoving = true;
        finishMovement = false;
        System.out.println("Начать движение ");

    }
    public void finishTheMovement() {
        startTheMoving = false;
        finishMovement = true;
        System.out.println("Закончить движение ");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    /*public interface Competing {
        void pitStop();

        void bestLapTime();

        void maximumSpeed();
    }*/
    /*private final String brand;
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
    }*/

}
