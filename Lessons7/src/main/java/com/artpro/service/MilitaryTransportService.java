package com.artpro.service;

import com.artpro.model.MilitaryTransport;

//Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет не равно 0 то выводим
//на консоль “ Ракета пошла…”, если 0 то “Боеприпасы отсутствуют”.
public class MilitaryTransportService {
    //создадим метод выстрела, возвращать ничего не будет, только вывод на консоль, через void сделаем
    public void calculationRocketsMilitaryTransportService(MilitaryTransport transport) {
        if (transport.getNumberOfMissilesOnBoard() > 0) {
            transport.setNumberOfMissilesOnBoard(transport.getNumberOfMissilesOnBoard() - 1);
            System.out.println("Ракета пошла...");
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    //создадим метод катапультирования
    public void calculationСatapultMilitaryTransportService(MilitaryTransport transport) {
        if (transport.isEjectionSystem()) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
