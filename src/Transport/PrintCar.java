package Transport;

public class PrintCar extends  Driver {


    public PrintCar(String name, Boolean aDriversLicense, Integer experience) {
        super(name, aDriversLicense, experience);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void finishTheMovement() {

    }

    @Override
    public void refuelTheCar() {

    }

    public static void main(String[] args) {
        DriverB driverB = new DriverB("Ivanov Ivan Ivanovich", true,9);
        DriverB driverB2 = new DriverB("Ivanov Petr Ivanovich", true,4);
        DriverB driverB3 = new DriverB("Ivanov Ivan Ivanovich", true,5);
        DriverB driverB4 = new DriverB("Ivanov Ivan Ivanovich", true,8);
        PassengerCar passengerCar= new PassengerCar("vaz", "2199",1.3,driverB);
        PassengerCar passengerCar2 = new PassengerCar("maz", "2190",1.2,driverB2);
        PassengerCar passengerCar3 = new PassengerCar("gaz", "2191",1.1,driverB3);
        PassengerCar passengerCar4 = new PassengerCar("taz", "2193",0.9,driverB4);
        DriverC driverC = new DriverC("Semenov Semen Semenovich", true,13);
        DriverC driverC2 = new DriverC("Semenov Semen Semenovich", true,10);
        DriverC driverC3 = new DriverC("Semenov Semen Semenovich", true,12);
        DriverC driverC4 = new DriverC("Semenov Semen Semenovich", true,15);
        TheBuses theBuses = new TheBuses("kia","optima",8.3,driverC);
        TheBuses theBuses2 = new TheBuses("suzuki","ocean",8.1,driverC2);
        TheBuses theBuses3 = new TheBuses("bmw","solaris",8.2,driverC3);
        TheBuses theBuses4 = new TheBuses("duf","bigger",8.4,driverC4);
        DriverD driverD = new DriverD("Ismailov Ruslan Petrovich", true,23);
        DriverD driverD2 = new DriverD("Ismailov Ruslan Petrovich", true,22);
        DriverD driverD3 = new DriverD("Ismailov Ruslan Petrovich", true,20);
        DriverD driverD4 = new DriverD("Ismailov Ruslan Petrovich", true,27);
        Trucks trucks = new Trucks("kamaz", "rz1",12.5,driverD);
        Trucks trucks2 = new Trucks("kama", "rz2",12.4,driverD2);
        Trucks trucks3 = new Trucks("belaz", "rz3",12.1,driverD3);
        Trucks trucks4 = new Trucks("porsche", "rz4",12.2,driverD4);
        System.out.println(driverB.getPrintInfo(passengerCar));
        System.out.println(driverB2.getPrintInfo(passengerCar2));
        System.out.println(driverB3.getPrintInfo(passengerCar3));
        System.out.println(driverB4.getPrintInfo(passengerCar4));
        System.out.println(driverC.getPrintInfo(theBuses));
        System.out.println(driverC2.getPrintInfo(theBuses2));
        System.out.println(driverC2.getPrintInfo(theBuses3));
        System.out.println(driverC3.getPrintInfo(theBuses4));
        System.out.println(driverD.getPrintInfo(trucks));
        System.out.println(driverD2.getPrintInfo(trucks2));
        System.out.println(driverD3.getPrintInfo(trucks3));
        System.out.println(driverD4.getPrintInfo(trucks4));



    }



}
