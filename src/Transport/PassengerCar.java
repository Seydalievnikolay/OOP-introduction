package Transport;

public class PassengerCar extends Transport <DriverB>  {

    public PassengerCar(String brand, String model, Double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }


    @Override
    public void pitStop() {
        System.out.println("Легковой автомобиль марки " + getBrand() + " на пит - стопе");
    }
    @Override
    public void bestLapTime() {
        int minTime = 5;
        int maxTime = 15;
        int lapTime = (int) (Math.random()*((maxTime-minTime)+2));
        System.out.println("Лучшее время круга легкового автомобиля " + lapTime + " минут");
    }
    @Override
    public void maximumSpeed() {
        int minSpeed = 70;
        int maxSpeed = 260;
        int lapTime = (int) (Math.random()*((maxSpeed-minSpeed)+11));
        System.out.println("Максимальная скорость легкового автомобиля " + lapTime + "км/ч");
    }
    @Override
    public  void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand()+ " начал движение");
    }
    @Override
    public  void finishTheMovement() {
        System.out.println("Легковой автомобиль " + getBrand()+ " закончил движение");
    }

}
