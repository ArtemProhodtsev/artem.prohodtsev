package com.artpro;


import com.artpro.model.CargoTransport;
import com.artpro.model.CivilTransport;
import com.artpro.model.GroundTransport;
import com.artpro.model.MilitaryTransport;
import com.artpro.service.CargoTransportService;
import com.artpro.service.CivilTransportService;
import com.artpro.service.MilitaryTransportService;
import com.artpro.service.PassengerTransportService;

public class Main {
    public static void main(String[] args) {
        //выведем в консоль метод из PassengerTransportService

        // создадим новый объект с именем passengerTransportService из класса PassengerTransportService
        PassengerTransportService passengerTransportService = new PassengerTransportService();
//       теперь объект passengerTransportService обладает всеми методами в классе PassengerTransportService
// простучимся к методу calculationPassengerTransport передав параметры метода и сначала написал вот так:
//        passengerTransportService.calculationPassengerTransport(Opel, 10);
        //но opel ещё не был создан и по этому воспользовался специальным builder()
        GroundTransport opel = GroundTransport.builder().brand("Opel").fuelСonsumption(10).maxSpeed(220).build();
        passengerTransportService.calculationPassengerTransport(opel, 2.5);

        //выводим в консоль метод из CargoTransportService

        CargoTransportService cargoTransportService = new CargoTransportService();
        CargoTransport garbageTruck = CargoTransport.builder().loadCapacity(10).build();
        cargoTransportService.calculationCargoTransportService(garbageTruck, 120);

        //добавляем вывод метода CivilTransportService

        CivilTransportService civilTransportService = new CivilTransportService(); //создали новый объект на основе метода CivilTransportService
        //создадим и заполним поля новго объекта (самолёт кукурузник - cornhusker)  на основе консуктора созданного в классе CivilTransport
        CivilTransport cornhusker = CivilTransport.builder().numberOfPassengers(2).build();
        civilTransportService.calculationCivilTransport(cornhusker, 1);
        //в созданном из шаблона класса CivilTransportService объекте civilTransportService обратились к методу  calculationCivilTransport
        // в качестве параметра метода положили туда наш созданный по шаблону класса CivilTransport объект кукурузник, ну и второй
        //параметр метода - указали число пассажиров для анализа вместимости

        //добавляем метод calculationRocketsMilitaryTransportService

        MilitaryTransportService militaryTransportService = new MilitaryTransportService();
        MilitaryTransport il2 = MilitaryTransport.builder().numberOfMissilesOnBoard(0).build(); //создали объект самолёта il2 без ракет
        MilitaryTransport il3 = MilitaryTransport.builder().numberOfMissilesOnBoard(10).build(); //создали объект самолёта il3 с ракетами и катапультой
        militaryTransportService.calculationRocketsMilitaryTransportService(il2);
        militaryTransportService.calculationRocketsMilitaryTransportService(il3);

        //добавляем метод calculationСatapultMilitaryTransportService
        MilitaryTransport.MilitaryTransportBuilder<?, ?> il4 = MilitaryTransport.builder().numberOfMissilesOnBoard(3).ejectionSystem(true); //есть катапульта в объекте il4
        MilitaryTransport.MilitaryTransportBuilder<?, ?> il5 = MilitaryTransport.builder().numberOfMissilesOnBoard(10).ejectionSystem(false); //нет катупульты в объекте il5
        militaryTransportService.calculationСatapultMilitaryTransportService(il4.build());
        militaryTransportService.calculationСatapultMilitaryTransportService(il5.build());

    }
}
