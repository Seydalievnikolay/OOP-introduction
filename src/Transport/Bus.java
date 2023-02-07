package Transport;

public class Bus extends Transport{
    public Bus(String brand, String model, String color, int productionYear, String productionCountry, int maximumMovementSpeed) {
        super(brand, model, color, productionYear, productionCountry, maximumMovementSpeed);
    }
public static void main (String[]args) {
    Bus man = new Bus("MAN", "FLY", "blue", 2020, "Germany", 110);
    Bus kamaz = new Bus("KAMAZ", "54017", "yellow", 2022, "Russia", 120);
    Bus kia = new Bus("KIA", "Starline", "black", 2023, "South Korea",100);
    System.out.println(man);
    System.out.println(kamaz);
    System.out.println(kia);
    }


}
