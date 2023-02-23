package Transport;

import java.util.*;

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

    public static void main(String[] args) throws Exception, TransportTypeException {
        Mechanic mechanic1 = new Mechanic("Пискунов Артём", "АСТ-54");
        Mechanic mechanic2 = new Mechanic("Иноземцев Иван", "АСТ-54");
        Mechanic mechanic3 = new Mechanic("Поляков Дмитрий", "Reaktor");
        Mechanic mechanic4 = new Mechanic("Савинов Вячеслав", "TopGear");

        List<Mechanic>mechanicLists = new ArrayList<>();
        mechanicLists.add(mechanic1);
        mechanicLists.add(mechanic2);
        mechanicLists.add(mechanic3);
        mechanicLists.add(mechanic4);



        DriverB driverB = new DriverB("Ivanov Ivan Ivanovich", true,9);
        DriverB driverB2 = new DriverB("Ivanov Petr Ivanovich", true,4);
        DriverB driverB3 = new DriverB("Ivanov Ivan Ivanovich", true,5);
        DriverB driverB4 = new DriverB("Ivanov Ivan Ivanovich", true,8);
        PassengerCar passengerCar= new PassengerCar("vaz", "2199",1.3,driverB,mechanicLists);
        PassengerCar passengerCar2 = new PassengerCar("maz", "2190",1.2,driverB2,mechanicLists);
        PassengerCar passengerCar3 = new PassengerCar("gaz", "2191",1.1,driverB3,mechanicLists);
        PassengerCar passengerCar4 = new PassengerCar("taz", "2193",0.9,driverB4,mechanicLists);
        DriverC driverC = new DriverC("Semenov Semen Semenovich", true,13);
        DriverC driverC2 = new DriverC("Semenov Semen Semenovich", true,10);
        DriverC driverC3 = new DriverC("Semenov Semen Semenovich", true,12);
        DriverC driverC4 = new DriverC("Semenov Semen Semenovich", true,15);
        TheBuses theBuses = new TheBuses("kia","optima",8.3,driverC,mechanicLists);
        TheBuses theBuses2 = new TheBuses("suzuki","ocean",8.1,driverC2,mechanicLists);
        TheBuses theBuses3 = new TheBuses("bmw","solaris",8.2,driverC3,mechanicLists);
        TheBuses theBuses4 = new TheBuses("duf","bigger",8.4,driverC4,mechanicLists);
        DriverD driverD = new DriverD("Ismailov Ruslan Petrovich", true,23);
        DriverD driverD2 = new DriverD("Ismailov Ruslan Petrovich", true,22);
        DriverD driverD3 = new DriverD("Ismailov Ruslan Petrovich", true,20);
        DriverD driverD4 = new DriverD("Ismailov Ruslan Petrovich", true,27);
        Trucks trucks = new Trucks("kamaz", "rz1",12.5,driverD,mechanicLists);
        Trucks trucks2 = new Trucks("kama", "rz2",12.4,driverD2,mechanicLists);
        Trucks trucks3 = new Trucks("belaz", "rz3",12.1,driverD3,mechanicLists);
        Trucks trucks4 = new Trucks("porsche", "rz4",12.2,driverD4,mechanicLists);
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
        System.out.println();

        for (TypeOfBody typeOfBody : TypeOfBody.values()) {
            System.out.println(typeOfBody.getType());
        }
        System.out.println();
        for (Capacity capacity : Capacity.values()) {
            System.out.println(capacity.getCapacityFrom() + capacity.getCapacityUpTo());
        }
        System.out.println();
        for (LoadCapacity loadCapacity : LoadCapacity.values()) {
            System.out.println(loadCapacity.getWeightFrom()+ " - " + loadCapacity.getWeightUpTo());
        }

        System.out.println();
        passengerCar.passDiagnostics();
        trucks.passDiagnostics();

        try {
            theBuses.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println("”Автобусы” диагностику проходить не должны");
        }
        List<Transport> list = new ArrayList<>();
        list.add(passengerCar);
        list.add(passengerCar2);
        list.add(passengerCar3);
        list.add(passengerCar4);
        list.add(theBuses);
        list.add(theBuses2);
        list.add(theBuses3);
        list.add(theBuses4);
        list.add(trucks);
        list.add(trucks2);
        list.add(trucks3);
        list.add(trucks4);

        passengerCar.mechanicLists.add(mechanic1);
        passengerCar2.mechanicLists.add(mechanic2);
        passengerCar3.mechanicLists.add(mechanic3);
        passengerCar4.mechanicLists.add(mechanic4);

        theBuses.mechanicLists.add(mechanic1);
        theBuses2.mechanicLists.add(mechanic2);
        theBuses3.mechanicLists.add(mechanic3);
        theBuses4.mechanicLists.add(mechanic4);

        trucks.mechanicLists.add(mechanic1);
        trucks2.mechanicLists.add(mechanic2);
        trucks3.mechanicLists.add(mechanic3);
        trucks4.mechanicLists.add(mechanic4);
        System.out.println();
        passengerCar2.nameOfTheDriver();
        theBuses2.carMechanics();
        trucks.nameOfTheDriver();
        System.out.println();
        Queue<ServiceStation>queue = new LinkedList<>();
        queue.add(passengerCar);
        queue.add(passengerCar2);
        queue.add(passengerCar3);
        queue.add(passengerCar4);
        queue.add(trucks);
        queue.add(trucks2);
        queue.add(trucks3);
        queue.add(trucks4);


        Iterator<ServiceStation> iterator = queue.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        Set<Driver>driverList = new HashSet<>();
        driverList.add(driverB);
        driverList.add(driverB2);
        driverList.add(driverB3);
        driverList.add(driverB4);
        driverList.add(driverC);
        driverList.add(driverC2);
        driverList.add(driverC3);
        driverList.add(driverC4);
        driverList.add(driverD);
        driverList.add(driverD2);
        driverList.add(driverD3);
        driverList.add(driverD4);
        /*if (driverList.contains(driverB)){
            System.out.print(driverList);
        };*/
        for (Driver driver : driverList){
            System.out.println(driver.getName() +" "+ driver.getExperience());
        }

    }



}
