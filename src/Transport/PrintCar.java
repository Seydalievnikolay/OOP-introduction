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


        DriverB driverB4 = new DriverB("Ivanov Ivan Ivanovich", true,8);
        PassengerCar passengerCar4 = new PassengerCar("taz", "2193",0.9,driverB4,mechanicLists);
        DriverC driverC4 = new DriverC("Semenov Semen Semenovich", true,15);
        TheBuses theBuses4 = new TheBuses("duf","bigger",8.4,driverC4,mechanicLists);
        DriverD driverD4 = new DriverD("Ismailov Ruslan Petrovich", true,27);
        Trucks trucks4 = new Trucks("porsche", "rz4",12.2,driverD4,mechanicLists);

        System.out.println(driverB4.getPrintInfo(passengerCar4));
        System.out.println(driverC4.getPrintInfo(theBuses4));
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
        passengerCar4.passDiagnostics();
        passengerCar4.passDiagnostics();

        try {
            theBuses4.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println("”Автобусы” диагностику проходить не должны");
        }
        List<Transport> list = new ArrayList<>();

        list.add(passengerCar4);
        list.add(theBuses4);
        list.add(trucks4);

        passengerCar4.mechanicLists.add(mechanic4);
        theBuses4.mechanicLists.add(mechanic4);
        trucks4.mechanicLists.add(mechanic4);
        System.out.println();

        System.out.println();
        Queue<ServiceStation>queue = new LinkedList<>();

        queue.add(passengerCar4);
        queue.add(trucks4);


        Iterator<ServiceStation> iterator = queue.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        Set<Driver>driverList = new HashSet<>();

        driverList.add(driverB4);
        driverList.add(driverC4);
        driverList.add(driverD4);

        for (Driver driver : driverList){
            System.out.println(driver.getName() +" "+ driver.getExperience());
        }

        Map<Transport,List> map = new HashMap<>();
        map.put(passengerCar4,mechanicLists);
        map.put(theBuses4,mechanicLists);
        map.put(trucks4,mechanicLists);

        for (Map.Entry result: map.entrySet()) {
            System.out.println(result.getKey() +" "+ result.getValue());
        }


    }



}
