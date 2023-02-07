package Transport;


public class Car extends Transport{

    public Double engineVolume;
    public String color;

    public String transmission;
    private final String  bodyType;
    public String registrationNumber;
    private final String numberOfSeats;
    private  boolean typeOfTires;

    private  Key key;


    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }





    public String getBodyType() {
        return bodyType;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean isTypeOfTires() {
        return typeOfTires;
    }

    public void setTypeOfTires(boolean typeOfTires) {
        this.typeOfTires = typeOfTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if ( key == null){
            key = new Key(false, false);
        }
        this.key = key;
    }

    public Car(String brand, String model, String color, int productionYear, String productionCountry, int maximumMovementSpeed, String bodyType, String numberOfSeats) {
        super(brand, model, color, productionYear, productionCountry, maximumMovementSpeed);
        this.bodyType = bodyType;
        this.numberOfSeats = numberOfSeats;
    }

    public Car(String brand, String model, Double engineVolume, String color, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, String numberOfSeats, boolean typeOfTires, Key key) {
        super();
        this.engineVolume = (engineVolume <=0 ? 1.5 : engineVolume);
        this.transmission = (isTransmissionEmpty(transmission) ? "default" : transmission);
        this.bodyType = (isBodyTypeEmpty(bodyType) ? "default" : bodyType);
        this.registrationNumber = (isRegistrationNumberEmpty(registrationNumber) ? "default" : registrationNumber);
        this.numberOfSeats = (isNumberOfSeatsEmpty(numberOfSeats) ? "default" : numberOfSeats);
        this.typeOfTires = typeOfTires;
        setKey(key);
    }

    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta",1.7, "yellow", 2015, "Russia", "mechanic", "sedan", "А002АА","4", true, new Key(false,true));
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, " Germany", "automatic", "coupe", "O001OO", "4", true, new Key(false,true));
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany","automatic", "convertible", "O010OO", "2", false, new Key(true,true));
        Car kia = new Car("Kia", "Sportage 4-го поколения", 2.4, "red", 2018, "South Korea","mechanic", "crossover", "B777BB", "4", false, new Key(false,false) );
        Car hyundai = new Car("Hyundai","Avante",1.6, "orange", 2016, "South Korea","automatic", "sedan", "Н054НН", "4", true, null);
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

    }


    public void changeTiresForSeasonalOnes(int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 3)) {
            typeOfTires = false;

        }
        if ( month >= 4 && month <= 10) {
            typeOfTires = true;

        }

    }
    private boolean isTransmissionEmpty( String transmission) {
        return transmission == null || transmission.isEmpty();

    }
    private boolean isBodyTypeEmpty(String bodyType) {
        return bodyType == null || bodyType.isEmpty();

    }
    private boolean isRegistrationNumberEmpty(String registrationNumber) {
        return registrationNumber == null || registrationNumber.isEmpty();

    }

    @Override
    public String toString() {
        return "Car: " +

                ", engineVolume = " + engineVolume +
                ", color = " + color + ' ' +

                ", transmission = " + transmission + ' ' +
                ", bodyType = " + bodyType + ' ' +
                ", registrationNumber = " + registrationNumber + ' ' +
                ", numberOfSeats = " + numberOfSeats + ' ' + ',' +
                (typeOfTires ? "летняя" : " зимняя" ) + " резина " + ',' +
                key;

    }

    private boolean isNumberOfSeatsEmpty(String numberOfSeats) {
        return numberOfSeats == null || numberOfSeats.isEmpty();

    }

    public static  class Key {
        private boolean remoteEngineStart;
        private boolean keylessAccess;



        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return (remoteEngineStart ? " удаленный запуск двигателя" : "без удаленного запуска двигателя") + ',' +
            (keylessAccess ? "бесключчевой доступ" : "бесключевой доступ отсутствует");
        }
    }

}
