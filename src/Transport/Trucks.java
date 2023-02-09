package Transport;

public class Trucks implements Competing {

    public Trucks(String brand, String model, Double engineVolume) {

    }
    public static void main(String [] args) {
        Trucks trucks1 = new Trucks("kamaz", "rz1",12.5);
        Trucks trucks2 = new Trucks("kama", "rz2",12.4);
        Trucks trucks3 = new Trucks("belaz", "rz3",12.1);
        Trucks trucks4 = new Trucks("porsche", "rz4",12.2);

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
