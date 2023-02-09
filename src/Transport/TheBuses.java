package Transport;

public class TheBuses implements Competing {


    public TheBuses(String brand, String model, Double engineVolume) {
    }

    public static void main(String [] args) {
        TheBuses bus1 = new TheBuses("kia","optima",8.3);
        TheBuses bus2 = new TheBuses("suzuki","ocean",8.1);
        TheBuses bus3 = new TheBuses("bmw","solaris",8.2);
        TheBuses bus4 = new TheBuses("duf","bigger",8.4);
        bus1.pitStop();
        bus2.pitStop();


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
