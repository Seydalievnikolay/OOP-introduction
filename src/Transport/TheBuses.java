package Transport;

import com.sun.jdi.connect.TransportTimeoutException;

import java.io.IOException;

public class TheBuses extends Transport <DriverC>  {


    public TheBuses(String brand, String model, Double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус марки " + getBrand() + " на пит - стопе ");
    }
    @Override
    public void bestLapTime() {
        int minTime = 4;
        int maxTime = 20;
        int lapTime = (int) (Math.random()*((maxTime-minTime)+2));
        System.out.println("Лучшее время круга автобуса " + lapTime + " минут");
    }
    @Override
    public void maximumSpeed() {
        int minSpeed = 40;
        int maxSpeed = 120;
        int lapTime = (int) (Math.random()*((maxSpeed-minSpeed)+11));
        System.out.println("Максимальная скорость автобуса " + lapTime + "км/ч");
    }
    @Override
    public  void startMoving() {
        System.out.println("Автобус  " + getBrand()+ " начал движение");
    }
    @Override
    public  void finishTheMovement() {
        System.out.println("Автобус" + getBrand()+ " закончил движение");
    }

    @Override
    public void getType() {
    }

    @Override
    public void printType() {
        System.out.println(Type.TheBuses);
    }

    @Override
    public void passDiagnostics() throws TransportTypeException, IOException{
        throw new TransportTypeException("”Автобусы” диагностику проходить не должны");
    }
}
enum Capacity{
    ESPECIALLY_SMALL(null, " до 10 мест"),
    SMALL(null, " до 25 мест"),
    MIDDLE("25 -", " 50"),
    BIG("50 -", " 80"),
    ESPECIALLY_BIG("80 -", " 120");

    private String capacityFrom;
    private String capacityUpTo;

    Capacity(String capacityFrom,String capacityUpTo) {
        this.capacityFrom=capacityFrom;
        this.capacityUpTo = capacityUpTo;
    }

    public String getCapacityFrom() {
        return capacityFrom;
    }

    public void setCapacityFrom(String capacityFrom) {
        this.capacityFrom = capacityFrom;
    }

    public String getCapacityUpTo() {
        return capacityUpTo;
    }

    public void setCapacityUpTo(String capacityUpTo) {
        this.capacityUpTo = capacityUpTo;
    }
}


