package Transport;

public class PassengerCar implements Competing {

    public PassengerCar(String brand, String model, Double engineVolume) {

    }
    public static void main(String [] args) {
        PassengerCar passengerCar1 = new PassengerCar("vaz", "2199",1.3);
        PassengerCar passengerCar2 = new PassengerCar("maz", "2190",1.2);
        PassengerCar passengerCar3 = new PassengerCar("gaz", "2191",1.1);
        PassengerCar passengerCar4 = new PassengerCar("taz", "2193",0.9);
    }
    @Override
    public void pitStop() {
        System.out.println("Пит - стоп");
    }
    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга ");
    }
    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость ");
    }


}
